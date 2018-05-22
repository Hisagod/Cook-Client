package com.aib.net;

import android.annotation.SuppressLint;
import android.arch.core.util.Function;
import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MediatorLiveData;
import android.arch.lifecycle.Observer;
import android.arch.lifecycle.Transformations;
import android.support.annotation.Nullable;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;

public abstract class NetworkResource<RequestType, ResultType> {
    private MediatorLiveData<Resource<ResultType>> data = new MediatorLiveData<>();

    public NetworkResource() {
        data.postValue(new Resource<ResultType>("加载中", Status.LOADING, null));
        final LiveData<ResultType> dbSource = loadFromDb();
        data.addSource(dbSource, new Observer<ResultType>() {
            @Override
            public void onChanged(@Nullable ResultType resultType) {
                data.removeSource(dbSource);
                if (shouldFetch(resultType)) {
                    fetchNetwork();
                } else {
                    data.addSource(dbSource, new Observer<ResultType>() {
                        @Override
                        public void onChanged(@Nullable ResultType resultType) {
                            setValue(new Resource<ResultType>(null, Status.SUCCESS, resultType));
                        }
                    });
                }
            }
        });
    }

    public void setValue(Resource<ResultType> newData) {
        if (data.getValue() != newData) {
            data.postValue(newData);
        }
    }

    @SuppressLint("CheckResult")
    private void fetchNetwork() {
        createCall()
                .subscribeOn(Schedulers.newThread())
                .doOnNext(new Consumer<RequestType>() {
                    @Override
                    public void accept(RequestType requestType) throws Exception {
                        saveData(requestType);
                    }
                })
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<RequestType>() {
                    @Override
                    public void accept(RequestType requestType) throws Exception {
                        LiveData<ResultType> dbResource = loadFromDb();
                        data.addSource(dbResource, new Observer<ResultType>() {
                            @Override
                            public void onChanged(@Nullable ResultType resultType) {
                                setValue(new Resource<ResultType>(null, Status.SUCCESS, resultType));
                            }
                        });
                    }
                }, new Consumer<Throwable>() {
                    @Override
                    public void accept(Throwable throwable) throws Exception {
                        setValue(new Resource<ResultType>(throwable.toString(), Status.ERROR, null));
                    }
                });
    }


    /**
     * 将数据转为LiveData
     *
     * @return
     */
    public LiveData<Resource<ResultType>> asLiveData() {
        return data;
    }

    public abstract void saveData(RequestType data);

    public abstract LiveData<ResultType> loadFromDb();

    public abstract boolean shouldFetch(ResultType data);

    public abstract Observable<RequestType> createCall();
}
