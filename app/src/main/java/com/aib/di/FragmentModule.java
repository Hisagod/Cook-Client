package com.aib.di;

import com.aib.view.fragment.TabFragment;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * 提供Fragment对象
 */
@Module
public abstract class FragmentModule {
    @ContributesAndroidInjector
    abstract TabFragment tabFragment();
}
