package com.example.komoriwu.kotlintest

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    var etText = "123"
    var tv: TextView? = null
    var btn: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tv = findViewById(R.id.textView) as TextView?
        btn = findViewById(R.id.button) as Button?
        etText = tv?.text as String
        btn?.setOnClickListener() {
            toast(etText)
        }
    }
}
