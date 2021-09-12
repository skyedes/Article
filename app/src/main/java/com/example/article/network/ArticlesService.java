package com.example.article.network;

import com.example.article.models.ArticlesResponse;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ArticlesService {

    @GET("v2/viewed/7.json")
    Observable<ArticlesResponse> getArticles(@Query("api-key") String apiKey);


}
