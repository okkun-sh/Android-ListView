package com.example.okkun.androidlistview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import com.example.okkun.androidlistview.adapter.DemoAdapter
import com.example.okkun.androidlistview.data.Demo

class ListViewActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_view)

        val mListView = findViewById<ListView>(R.id.demo_list)
        val items: List<Demo> = listOf(
                Demo("hoge1", "bar1"),
                Demo("hoge2", "bar2"),
                Demo("hoge3", "bar3"),
                Demo("hoge4", "bar4"),
                Demo("hoge5", "bar5"),
                Demo("hoge6", "bar6"),
                Demo("hoge7", "bar7"),
                Demo("hoge8", "bar8"),
                Demo("hoge9", "bar9"),
                Demo("hoge10", "bar10"),
                Demo("hoge11", "bar11"),
                Demo("hoge12", "bar12"),
                Demo("hoge13", "bar13"),
                Demo("hoge14", "bar14"),
                Demo("hoge15", "bar15"),
                Demo("hoge16", "bar16"),
                Demo("hoge17", "bar17"),
                Demo("hoge18", "bar18"),
                Demo("hoge19", "bar19"),
                Demo("hoge20", "bar20")
        )
        val adapter = DemoAdapter(
                this,
                items
        )
        mListView.adapter = adapter
    }
}
