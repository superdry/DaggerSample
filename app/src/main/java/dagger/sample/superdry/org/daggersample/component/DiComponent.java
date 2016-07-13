package dagger.sample.superdry.org.daggersample.component;

import javax.inject.Singleton;

import dagger.Component;
import dagger.sample.superdry.org.daggersample.MainActivity;
import dagger.sample.superdry.org.daggersample.NetworkApiModule;

/**
 * Created by superdry on 2016/07/12.
 */


@Singleton
@Component(modules = {NetworkApiModule.class})
public interface DiComponent {
    // to update the fields in your activities
    void inject(MainActivity activity);
}

