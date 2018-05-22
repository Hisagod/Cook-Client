package com.aib.viewmodel;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.LiveData;
import android.support.annotation.NonNull;

import com.aib.di.DaggerAppComponent;
import com.aib.entity.TypeEntity;
import com.aib.net.Resource;
import com.aib.repository.MainRepository;

import javax.inject.Inject;

public class MainViewModel extends AndroidViewModel {
    @Inject
    protected MainRepository rep;

    public MainViewModel(@NonNull Application application) {
        super(application);

        DaggerAppComponent.create().inject(this);
    }

    public LiveData<Resource<TypeEntity>> getJson(String key) {
        return rep.getJson(key);
    }
}
