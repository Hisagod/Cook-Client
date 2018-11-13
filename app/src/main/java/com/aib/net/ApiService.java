package com.aib.net;

import com.aib.entity.BaseEntity;
import com.aib.entity.TypeEntity;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiService {
    String baseUrl = "http://apicloud.mob.com/";


    /**
     * 查询菜谱分类
     *
     * @param key
     * @return
     */
    @GET("v1/cook/category/query")
    Observable<BaseEntity<TypeEntity>> COOK_TYPE(@Query("key") String key);

}
