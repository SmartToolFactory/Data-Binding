package com.example.tutorial4recylerviewbindingadapter.adapter

import com.example.tutorial4recylerviewbindingadapter.R
import com.example.tutorial4recylerviewbindingadapter.model.TemperatureData

class MyAdapter// Provide a suitable constructor (depends on the kind of data set)
(private var data: List<TemperatureData>) : MyBaseAdapter() {


    override fun getDataAtPosition(position: Int): Any {
        return data[position]
    }

    override fun getLayoutIdForType(viewType: Int): Int {
        return R.layout.rowlayout
    }

    override fun getItemCount(): Int {
        return data.size
    }
}
