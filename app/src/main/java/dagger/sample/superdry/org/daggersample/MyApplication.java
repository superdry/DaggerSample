package dagger.sample.superdry.org.daggersample;

import android.app.Application;
import javax.inject.Singleton;

import dagger.Component;
import dagger.sample.superdry.org.daggersample.component.DaggerDiComponent;
import dagger.sample.superdry.org.daggersample.component.DiComponent;

/**
 * Created by superdry on 2016/07/12.
 */

public class MyApplication extends Application {

    @Singleton
    @Component(modules = NetworkApiModule.class)
    public interface ApplicationComponent extends DiComponent {
    }

    DiComponent component = createComponent();

    protected DiComponent createComponent(){
//        return DaggerDiComponent.builder().networkApiModule().build();
        return DaggerMyApplication_ApplicationComponent.builder().networkApiModule(new NetworkApiModule()).build();
    }

    public DiComponent getComponent() {
        return component;
    }
}
