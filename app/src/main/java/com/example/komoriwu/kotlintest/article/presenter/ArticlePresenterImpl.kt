package com.example.komoriwu.kotlintest.article.presenter

import android.content.Context
import com.example.komoriwu.kotlintest.article.model.ArticleModel
import com.example.komoriwu.kotlintest.article.model.ArticleModelImpl
import com.example.komoriwu.kotlintest.article.view.ArticleView
import com.example.komoriwu.kotlintest.bean.ArticleBody

/**
 * Created by KomoriWu on 2017/6/2.
 */
class ArticlePresenterImpl(private var mContext: Context,
                           private var mArticleView: ArticleView?) :
        ArticlePresenter, ArticleModelImpl.OnLoadListListener {

    private var mArticleModel: ArticleModel? = null

    init {
        mArticleModel = ArticleModelImpl()
    }

    override fun loaderArticle(page: String, size: String) {
        mArticleModel?.loaderArticle(mContext, page, size, this)
    }

    override fun onSuccess(t: ArticleBody?) {
        mArticleView?.addArticleList(t)
    }

    override fun onFail(e: Throwable?) {
    }

}