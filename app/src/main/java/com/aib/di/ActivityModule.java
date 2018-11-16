package com.aib.di;

import com.aib.view.activity.MainActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * Activity提供对象
 */
@Module
abstract public class ActivityModule {
    @ContributesAndroidInjector
    abstract MainActivity mainActivity();
}
