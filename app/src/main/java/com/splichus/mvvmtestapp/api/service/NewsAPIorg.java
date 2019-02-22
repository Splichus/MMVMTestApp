package com.splichus.mvvmtestapp.api.service;

import com.splichus.mvvmtestapp.api.model.APIResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Query;

public interface NewsAPIorg {

    @Headers("Accept: application/json")
    @GET("everything")
    Call<APIResponse> getEverything(@Header("X-Api-Key") String apiKey, @Query("pageSize") int pageSize, @Query("q") String keyword);

}
