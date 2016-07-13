package dagger.sample.superdry.org.daggersample;

import dagger.sample.superdry.org.daggersample.component.DiComponent;

/**
 * Created by superdry on 2016/07/12.
 */

public class MockMyApplication extends MyApplication {

    @Override
    protected DiComponent createComponent() {
        return DaggerMainActivityTest_MockComponent.builder().mockNetworkApiModule(new MockNetworkApiModule()).build();
    }
}
