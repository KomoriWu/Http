package com.example.komoriwu.kotlintest.article.view

import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import com.example.komoriwu.kotlintest.R
import com.example.komoriwu.kotlintest.base.BaseActivity
import com.example.komoriwu.kotlintest.bean.Article
import org.jetbrains.anko.find

class MainActivity : BaseActivity(R.layout.activity_main) {
    private var mRecyclerView: RecyclerView? = null
    private var mArticleAdapter: ArticleAdapter? = null

    override fun initView() {
        mRecyclerView = find(R.id.recycle_view)
    }

    override fun initData() {
        initToolbar(R.string.app_name)
        mRecyclerView?.layoutManager = LinearLayoutManager(this, LinearLayoutManager.
                VERTICAL, false)
        val articleList = ArrayList<Article>()
        (0..10).mapTo(articleList) { Article("title" + it, "content" + it) }
        mArticleAdapter = ArticleAdapter(articleList)
        mRecyclerView?.adapter = mArticleAdapter
    }


}
