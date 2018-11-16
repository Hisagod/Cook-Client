package com.aib.di;

import com.aib.CookApplication;
import com.aib.viewmodel.MainViewModel;

import dagger.Component;
import dagger.android.support.AndroidSupportInjectionModule;

@Component(modules = {AndroidSupportInjectionModule.class, AppModule.class, ActivityModule.class, FragmentModule.class})
public interface AppComponent {
    void inject(CookApplication cookApplication);
}
