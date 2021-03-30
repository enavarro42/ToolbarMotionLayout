package com.clinkzcode.toolbarmotionlayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.clinkzcode.toolbarmotionlayout.databinding.ActivityMainBinding
import com.xwray.groupie.GroupAdapter
import com.xwray.groupie.GroupieViewHolder
import com.xwray.groupie.Item

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private val groupAdapter = GroupAdapter<GroupieViewHolder>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initRecyclerview()
    }

    private fun initRecyclerview() {
        groupAdapter.addAll(generateData())
        binding.recyclerviewContent.apply {
            layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
            adapter = groupAdapter
        }
    }

    private fun generateData(): List<Item<*>> {
        val itemList = ArrayList<Item<*>>()
        for(i in 1..15) {
            itemList.add(SampleItem())
        }
        return itemList
    }
}