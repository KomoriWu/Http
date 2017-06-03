package com.example.komoriwu.kotlintest.article.model

import android.content.Context

/**
 * Created by KomoriWu on 2017/6/2.
 */
interface ArticleModel {
    fun loaderArticle(context: Context, page: String, size: String,
                      onLoadListListener: ArticleModelImpl.OnLoadListListener)
}