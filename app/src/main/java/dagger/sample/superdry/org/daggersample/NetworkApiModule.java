package dagger.sample.superdry.org.daggersample;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by superdry on 2016/07/12.
 */

@Module
public class NetworkApiModule {
    @Provides
    @Singleton
    public NetworkApi getNetwork(){
        return new NetworkApi();
    }
}
