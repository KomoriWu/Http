package com.example.komoriwu.kotlintest.bean

import com.google.gson.annotations.SerializedName

import java.io.Serializable

/**
 * Created by KomoriWu
 * on 2017-06-02.
 */

class Article : Serializable {
    @SerializedName("coll_time")
    var collectionTime: String? = null
    @SerializedName("id")
    var id: String? = null
    @SerializedName("userAccount")
    var userAccount: String? = null
    @SerializedName("userName")
    var userName: String? = null
    @SerializedName("headImg")
    var headImgUrl: String? = null
    @SerializedName("cover")
    var coverUrl: String? = null
    @SerializedName("views")
    var views: String? = null
    @SerializedName("likes")
    var likes: String? = null
    @SerializedName("time")
    var time: String? = null
    @SerializedName("titel")
    var title: String? = null
    @SerializedName("brief_content")
    var briefContent: String? = null
    @SerializedName("detail_content")
    var detailContent: String? = null
    @SerializedName("album_500_500")
    var albumUrl: String? = null
    @SerializedName("file_link")
    var fileLink: String? = null
}
