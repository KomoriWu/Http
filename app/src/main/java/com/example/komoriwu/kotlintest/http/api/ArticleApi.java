package com.example.komoriwu.kotlintest.http.api;

import com.example.http.api.BaseApi;
import com.example.http.listener.HttpOnNextListener;
import com.example.komoriwu.kotlintest.http.sevice.HttpService;
import com.trello.rxlifecycle.components.support.RxAppCompatActivity;

import java.util.HashMap;
import java.util.Map;

import retrofit2.Retrofit;
import rx.Observable;

import static com.example.komoriwu.kotlintest.utils.UtilsKt.BASE_URL;

/**
 * Created by KomoriWu
 * on 2017-06-02.
 */

public class ArticleApi extends BaseApi {
    private String mPage;
    private String mSize;

    public ArticleApi(RxAppCompatActivity rxAppCompatActivity, String page, String size,
                      HttpOnNextListener listener) {
        super(rxAppCompatActivity, listener,BASE_URL);
        this.mPage = page;
        this.mSize = size;
        //是否显示加载框
        setShowProgress(false);
    }

    //提供请求所需字段的数据
    @Override
    public Observable getObservable(Retrofit retrofit) {
        Map<String, String> map = new HashMap<>();
        map.put("page", mPage);
        map.put("size", mSize);
        HttpService service = retrofit.create(HttpService.class);
        return service.getAllArticles(map);//传数据到HttpService
    }
}
