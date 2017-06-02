package com.example.komoriwu.kotlintest.base

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import android.widget.TextView
import com.example.komoriwu.kotlintest.R
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
        initListener()

    }

    open fun initView() {

    }

    open fun initListener() {

    }

    open fun initToolbar(text: Int=R.string.no_title, isShowBackBar: Boolean = true) {
        val toolbar: Toolbar? = find(R.id.toolbar)
        val tvTitle: TextView? = find(R.id.tv_toolbar_title)

        toolbar?.let {
            setSupportActionBar(toolbar)
            val actionBar = supportActionBar
            actionBar?.let {
                actionBar.setDisplayHomeAsUpEnabled(isShowBackBar)
                actionBar.setDisplayShowTitleEnabled(false)
                toolbar.setNavigationOnClickListener() { onBackPressed() }
            }
            tvTitle?.text = getString(text)
        }
    }
}

