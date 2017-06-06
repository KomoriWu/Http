package com.example.komoriwu.kotlintest.http.sevice;


import com.example.komoriwu.kotlintest.bean.ArticleBody;

import java.util.Map;

import retrofit2.http.GET;
import retrofit2.http.QueryMap;
import rx.Observable;

import static com.example.komoriwu.kotlintest.utils.UtilsKt.GET_ALL_ARTICLES;

/**
 * Created by KomoriWu
 * on 2017-03-24.
 */

public interface HttpService {
    @GET(GET_ALL_ARTICLES)
    Observable<ArticleBody> getAllArticles(@QueryMap Map<String, String> map);
}
