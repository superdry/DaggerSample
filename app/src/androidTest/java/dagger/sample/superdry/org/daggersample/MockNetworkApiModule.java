package dagger.sample.superdry.org.daggersample;

import org.mockito.Mockito;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by superdry on 2016/07/12.
 */
@Module
public class MockNetworkApiModule {
    @Provides
    @Singleton
    public NetworkApi getNetwork(){
        return Mockito.mock(NetworkApi.class);
    }
}
