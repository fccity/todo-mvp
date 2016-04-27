package com.binfenfuture.fccity.todomvp;

import android.app.Application;

import com.facebook.drawee.backends.pipeline.Fresco;

/**
 * Created by fccity on 16/4/26.
 */
public class AppApplication extends Application {
    public static AppApplication instance;

    public synchronized static AppApplication getInstance() {
        if (null == instance) {
            instance = new AppApplication();
        }
        return instance;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;

        Fresco.initialize(instance);
    }
}
