package com.example.okkun.androidlistview

import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.okkun.androidlistview.data.Demo
import com.example.okkun.androidlistview.databinding.ActivityDetailBinding


class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        val key1 = intent.getStringExtra("key1")
        val key2 = intent.getStringExtra("key2")
        val binding = DataBindingUtil.setContentView<ActivityDetailBinding>(this, R.layout.activity_detail)
        val demo = Demo(key1, key2)
        binding.demo = demo
    }
}
