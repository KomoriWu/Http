package com.example.komoriwu.kotlintest

import android.content.Context
import android.widget.Toast

/**
 * Created by KomoriWu on 2017/5/29.
 */
fun Context.toast(message: String, length: Int = Toast.LENGTH_SHORT) {
    Toast.makeText(this, message, length).show();
}
