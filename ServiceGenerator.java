package com.example.rxjavademo.flatmap;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava3.RxJava3CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

class ServiceGenerator {
    public static final String BASE_URL = "https://jsonplaceholder.typicode.com";
// .addCallAdapterFactory(RxJava3CallAdapterFactory.create()): Cho phép RequestAPI trả về 1 Observable
    public static Retrofit.Builder retrofitBuilder =
            new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addCallAdapterFactory(RxJava3CallAdapterFactory.create())
                    .addConverterFactory(GsonConverterFactory.create());

    private static Retrofit retrofit = retrofitBuilder.build();

    private static RequestApi requestApi = retrofit.create(RequestApi.class);

    public static RequestApi getRequestApi() {
        return requestApi;
    }
}
