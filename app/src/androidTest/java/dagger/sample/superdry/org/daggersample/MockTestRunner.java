package dagger.sample.superdry.org.daggersample;

import android.app.Application;
import android.content.Context;
import android.support.test.runner.AndroidJUnitRunner;


/**
 * Created by superdry on 2016/07/12.
 */

public class MockTestRunner extends AndroidJUnitRunner {
    @Override
    public Application newApplication(ClassLoader cl, String className, Context context)
            throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        return super.newApplication(cl, MockMyApplication.class.getName(), context);
    }
}
