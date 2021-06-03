package com.example.rxjavademo.flatmap;


import java.util.List;

import io.reactivex.rxjava3.core.Observable;
import retrofit2.http.GET;
import retrofit2.http.Path;

interface RequestApi {

    @GET("posts")
    Observable<List<Post>> getPosts();

    @GET("posts/{id}/comments")
    Observable<List<Comment>> getComments(@Path("id") int id);
}
