package com.arudanovsky.videocatalog.data.api;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Мегатрон on 19.02.2018.
 */

public class RetrofitClient {

    public static FilmsApi build() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(FilmsApi.URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        return retrofit.create(FilmsApi.class);
    }
}
