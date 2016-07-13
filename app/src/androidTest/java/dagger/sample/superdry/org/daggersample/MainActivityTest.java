package dagger.sample.superdry.org.daggersample;

import android.app.Instrumentation;
import android.content.Intent;
import android.support.test.InstrumentationRegistry;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;

import javax.inject.Inject;
import javax.inject.Singleton;

import dagger.Component;
import dagger.sample.superdry.org.daggersample.component.DiComponent;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

/**
 * Created by superdry on 2016/07/12.
 */
@RunWith(AndroidJUnit4.class)
public class MainActivityTest {

    @Inject
    NetworkApi networkApi;

    @Singleton
    @Component(modules = MockNetworkApiModule.class)
    public interface MockComponent extends DiComponent {
        void inject(MainActivityTest mainActivityTest);
    }

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class, true, false);

    @Before
    public void setup(){
        Instrumentation instrumentation = InstrumentationRegistry.getInstrumentation();
        MockMyApplication app
                = (MockMyApplication) instrumentation.getTargetContext().getApplicationContext();
        MockComponent component = (MockComponent) app.getComponent();
        component.inject(this);
    }

    @Test
    public void launch(){
        Mockito.when(networkApi.apiOrMock()).thenReturn("Mock");

        activityRule.launchActivity(new Intent());

        onView(withId(R.id.target))
                .check(matches(withText("Dependency injection worked: Mock")));


    }
}

