package com.example.a20110641.service;

import com.example.a20110641.model.Category;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface APIService {
    @GET("categories.php")
    Call<List<Category>> getCategoriesAll();

    @GET("categoriy.php")
    Call<Category> getCategory();

//    @POST("/v1/user/")
//    @FormUrlEncoded
//    Call<User> login(@Field("username") String username, @Field("password") String password);

}
