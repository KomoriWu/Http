package com.example.komoriwu.kotlintest.module

import android.content.Context
import com.example.komoriwu.kotlintest.article.presenter.ArticlePresenter
import com.example.komoriwu.kotlintest.article.presenter.ArticlePresenterImpl
import com.example.komoriwu.kotlintest.article.view.ArticleView
import dagger.Module
import dagger.Provides

/**
 * Created by KomoriWu
 * on 2017-06-05.
 */
@Module
class ArticleModule(private var mContext: Context,
                    private var mArticleView: ArticleView) {
    @Provides
    fun providePresenter(): ArticlePresenter {
        return ArticlePresenterImpl(mContext, mArticleView)
    }
}