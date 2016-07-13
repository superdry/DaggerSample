package dagger.sample.superdry.org.daggersample;

import javax.inject.Singleton;

/**
 * Created by superdry on 2016/07/12.
 */
@Singleton
public class NetworkApi {

    public String apiOrMock(){
        return "API";
    }

}
