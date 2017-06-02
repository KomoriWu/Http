package com.example.komoriwu.kotlintest.base

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import android.widget.TextView
import com.example.komoriwu.kotlintest.R
import com.example.komoriwu.kotlintest.R.id.tv_toolbar_title
import org.jetbrains.anko.find

/**
 * Created by KomoriWu on 2017/6/1.
 */
abstract class BaseActivity(var layoutId: Int) : AppCompatActivity() {
    abstract fun initData()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layoutId)
        initView()
        initData()

    }

    open fun initView() {

    }

    open fun initToolbar(isShowBackBar: Boolean = true, text: Int = null!!) {
        val toolbar: Toolbar? = find(R.id.toolbar)
        va tvTitle: TextView? = find(R.id.tv_toolbar_title)

        toolbar?.let {
            setSupportActionBar(toolbar)
            val actionBar = supportActionBar
            actionBar?.let {
                actionBar.setDisplayHomeAsUpEnabled(isShowBackBar)
                actionBar.setDisplayShowTitleEnabled(false)
                toolbar.setNavigationOnClickListener() { onBackPressed() }
            }
            title = ""
            tvTitle?.text = getString(text)
        }
    }
}

