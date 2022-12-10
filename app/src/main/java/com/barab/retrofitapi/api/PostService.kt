package com.barab.retrofitapi.api

import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path

interface PostService {

    @GET ("/posts")
    fun getAll(): Call<List<PostResponse>>


//    получение определенного поста, например по id
    @GET ("/posts/{id}")
    fun getById(@Path("id") id:Int) : Call<PostResponse>



//    как отправить JSON
    @POST("/posts")
    fun insert(@Body postResponse: PostResponse): Call<PostResponse>

}