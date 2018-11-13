package com.aib;

import android.app.Activity;
import android.app.Application;

import com.blankj.utilcode.util.Utils;

import javax.inject.Inject;

import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasActivityInjector;

public class CookApplication extends Application implements HasActivityInjector {
    @Inject
    DispatchingAndroidInjector<Activity> injector;

    @Override
    public void onCreate() {
        super.onCreate();
        initSdk();

    }

    private void initSdk() {
        Utils.init(this);
    }

    @Override
    public AndroidInjector<Activity> activityInjector() {
        return injector;
    }
}
