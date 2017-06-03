package com.example.komoriwu.kotlintest.article

import android.support.v7.widget.RecyclerView
import android.util.Log
import com.example.komoriwu.kotlintest.R
import com.example.komoriwu.kotlintest.article.presenter.ArticlePresenter
import com.example.komoriwu.kotlintest.article.presenter.ArticlePresenterImpl
import com.example.komoriwu.kotlintest.article.view.ArticleView
import com.example.komoriwu.kotlintest.base.BaseActivity
import com.example.komoriwu.kotlintest.bean.ArticleBody
import org.jetbrains.anko.find

class MainActivity : BaseActivity(R.layout.activity_main), ArticleView {

    private var mRecyclerView: RecyclerView? = null
    private var mArticleAdapter: ArticleAdapter? = null
    private var mArticlePresenter: ArticlePresenter? = null

    override fun initView() {
        mRecyclerView = find(R.id.recycle_view)
    }

    override fun initData() {
        initToolbar(com.example.komoriwu.kotlintest.R.string.app_name)
        mArticlePresenter = ArticlePresenterImpl(this, this)
        mArticlePresenter?.loaderArticle("1", "8")
//        mRecyclerView?.layoutManager = LinearLayoutManager(this, LinearLayoutManager.
//                VERTICAL, false)
//        mRecyclerView?.adapter = mArticleAdapter

    }

    override fun addArticleList(articleBody: ArticleBody?) {
        Log.d("articleBody:", articleBody.toString())
    }

}
