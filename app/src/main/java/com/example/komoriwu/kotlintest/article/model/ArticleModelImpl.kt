package com.example.komoriwu.kotlintest.article.model

import android.content.Context
import com.example.http.HttpManager
import com.example.http.listener.HttpOnNextListener
import com.example.komoriwu.kotlintest.bean.ArticleBody
import com.example.komoriwu.kotlintest.http.api.ArticleApi
import com.trello.rxlifecycle.components.support.RxAppCompatActivity
import dagger.Module


/**
 * Created by KomoriWu on 2017/6/2.
 */
class ArticleModelImpl : ArticleModel {

    override fun loaderArticle(context: Context, page: String, size: String,
                               onLoadListListener: OnLoadListListener) {
        val articleApi: ArticleApi = ArticleApi(context as RxAppCompatActivity, page, size, object :
                HttpOnNextListener<ArticleBody>() {
            override fun onNext(t: ArticleBody?) {
                onLoadListListener.onSuccess(t);
            }

            override fun onError(e: Throwable?) {
                onLoadListListener.onFail(e);
            }
        })
        HttpManager.getInstance().doHttpDeal(articleApi)
    }

    interface OnLoadListListener {
        fun onSuccess(t: ArticleBody?)
        fun onFail(e: Throwable?)
    }
}