package com.example.komoriwu.kotlintest.component

import com.example.komoriwu.kotlintest.article.MainActivity
import com.example.komoriwu.kotlintest.module.ArticleModule
import dagger.Component

/**
 * Created by KomoriWu
 * on 2017-06-05.
 */

@Component(modules = arrayOf(ArticleModule::class))
interface ArticleComponent {
    fun inject(mainActivity: MainActivity)
}