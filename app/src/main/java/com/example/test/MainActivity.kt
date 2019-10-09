package com.example.test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.test.adapter.ExampleAdapter
import com.example.test.dto.ExampleDto
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    val data = mutableListOf<ExampleDto>()
    var adapter: ExampleAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = ExampleAdapter(this, data)
        rv_main.layoutManager = LinearLayoutManager(this)
        rv_main.adapter = adapter

        data.add(ExampleDto())
        data.add(ExampleDto())
        data.add(ExampleDto())
        data.add(ExampleDto())
        data.add(ExampleDto())
        data.add(ExampleDto())
        data.add(ExampleDto())
        data.add(ExampleDto())
        data.add(ExampleDto())
        data.add(ExampleDto())
        data.add(ExampleDto())
        data.add(ExampleDto())
        data.add(ExampleDto())
        data.add(ExampleDto())
        data.add(ExampleDto())
        data.add(ExampleDto())

        adapter!!.notifyDataSetChanged()
    }
}
