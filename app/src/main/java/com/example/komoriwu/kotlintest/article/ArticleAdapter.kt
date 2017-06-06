package com.example.komoriwu.kotlintest.article

import android.support.v7.widget.RecyclerView
import android.support.v7.widget.RecyclerView.Adapter
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.komoriwu.kotlintest.R
import com.example.komoriwu.kotlintest.bean.Article
import org.jetbrains.anko.find

/**
 * Created by KomoriWu on 2017/6/2.
 */
class ArticleAdapter : Adapter<ArticleAdapter.ArticleViewHolder>() {
    private var articleList: MutableList<Article>? = null

    fun addArticleList(articleList: MutableList<Article>) {
        this.articleList = articleList
        notifyDataSetChanged()
    }

    override fun getItemCount(): Int = if (articleList == null) 0 else articleList!!.size

    override fun onBindViewHolder(holder: ArticleViewHolder?, position: Int) {
        articleList?.get(position)?.let { holder?.bindData(it) }
    }

    override fun onCreateViewHolder(parent: ViewGroup?, p1: Int): ArticleViewHolder {
        return LayoutInflater.from(parent?.context).inflate(R.layout.item, parent, false).let {
            ArticleViewHolder(it)
        }
    }

    class ArticleViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvTitle: TextView = itemView.find(R.id.tv_title)
        var tvContent: TextView = itemView.find(R.id.tv_content)
        fun bindData(article: Article) {
            with(article) {
                tvTitle.text = title
                tvContent.text = briefContent
            }
        }
    }
}