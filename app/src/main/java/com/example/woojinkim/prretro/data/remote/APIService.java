package com.example.woojinkim.prretro.data.remote;

/**
 * Created by woojinkim on 2017. 10. 24..
 */

import com.example.woojinkim.prretro.data.model.Post;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface APIService {

    @POST("/users/signup")
    @FormUrlEncoded
    Call<Post> savePost(@Field("id") String id,
                        @Field("pwd") String pwd);


}