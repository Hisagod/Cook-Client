package com.aib.repository;

import android.arch.lifecycle.LiveData;

import com.aib.entity.BaseEntity;
import com.aib.entity.TypeEntity;
import com.aib.net.ApiService;
import com.aib.net.NetworkResource;
import com.aib.net.Resource;

import javax.inject.Inject;

import io.reactivex.Observable;

public class MainRepository {
    @Inject
    protected ApiService apiService;

    @Inject
    public MainRepository() {
    }

    public LiveData<Resource<TypeEntity>> getJson(final String key) {
        return new NetworkResource<BaseEntity<TypeEntity>, TypeEntity>() {

            @Override
            public void saveData(BaseEntity<TypeEntity> data) {

            }

            @Override
            public LiveData<TypeEntity> loadFromDb() {
                return null;
            }

            @Override
            public boolean shouldFetch(TypeEntity data) {
                return true;
            }

            @Override
            public Observable<BaseEntity<TypeEntity>> createCall() {
                return apiService.COOK_TYPE(key);
            }
        }.asLiveData();
    }
}
