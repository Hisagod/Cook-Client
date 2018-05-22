package com.aib.di;

import com.aib.activity.MainActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
abstract public class ActivityModule {
    @ContributesAndroidInjector
    abstract MainActivity mainActivity();
}
