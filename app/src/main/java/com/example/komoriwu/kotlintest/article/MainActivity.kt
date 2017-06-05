package com.example.komoriwu.kotlintest.article

import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.util.Log
import com.example.komoriwu.kotlintest.R
import com.example.komoriwu.kotlintest.article.presenter.ArticlePresenter
import com.example.komoriwu.kotlintest.article.view.ArticleView
import com.example.komoriwu.kotlintest.base.BaseActivity
import com.example.komoriwu.kotlintest.bean.ArticleBody
import com.example.komoriwu.kotlintest.component.DaggerArticleComponent
import com.example.komoriwu.kotlintest.module.ArticleModule
import org.jetbrains.anko.find
import javax.inject.Inject

class MainActivity : BaseActivity(R.layout.activity_main), ArticleView {
   @Inject
    lateinit var mArticlePresenter: ArticlePresenter
    private var mRecyclerView: RecyclerView? = null
    private var mArticleAdapter: ArticleAdapter? = null

    override fun initView() {
        mRecyclerView = find(R.id.recycle_view)
    }

    override fun initData() {
        initToolbar(com.example.komoriwu.kotlintest.R.string.app_name)
        mRecyclerView?.layoutManager = LinearLayoutManager(this, LinearLayoutManager.
                VERTICAL, false)
        mArticleAdapter = ArticleAdapter()
        mRecyclerView?.adapter = mArticleAdapter

        DaggerArticleComponent.builder().articleModule(ArticleModule(this, this))
                .build().inject(this)
//        mArticlePresenter = ArticlePresenterImpl(this, this)
        mArticlePresenter.loaderArticle("1", "8")
    }

    override fun addArticleList(articleBody: ArticleBody?) {
        mArticleAdapter?.addArticleList(articleBody?.articleArrayList!!)
        Log.d("articleBody:", articleBody.toString())
    }

}
