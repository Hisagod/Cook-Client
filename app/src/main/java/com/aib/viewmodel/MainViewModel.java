package com.aib.viewmodel;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.LiveData;
import android.support.annotation.NonNull;

import com.aib.entity.TypeEntity;
import com.aib.net.Resource;
import com.aib.repository.MainRepository;


public class MainViewModel extends AndroidViewModel {

    private MainRepository rep;

    public MainViewModel(@NonNull Application application) {
        super(application);
        rep = new MainRepository();
    }

    public LiveData<Resource<TypeEntity>> getJson(String key) {
        return rep.getJson(key);
    }
}
