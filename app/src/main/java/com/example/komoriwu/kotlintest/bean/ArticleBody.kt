package com.example.komoriwu.kotlintest.bean

import com.google.gson.annotations.SerializedName

import java.util.ArrayList

/**
 * Created by KomoriWu
 * on 2017-06-02.
 */

class ArticleBody {
    @SerializedName("page")
    var page: Int = 0
    @SerializedName("size")
    var size: Int = 0
    @SerializedName("count")
    var count: Int = 0
    @SerializedName("article")
    var articleArrayList: ArrayList<Article>? = null

    override fun toString(): String {
        return "ArticleBody(page=$page, size=$size, count=$count, articleArrayList=$articleArrayList)"
    }

}
