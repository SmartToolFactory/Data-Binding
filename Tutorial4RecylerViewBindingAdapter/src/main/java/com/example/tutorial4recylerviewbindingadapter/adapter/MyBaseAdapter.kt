package com.example.tutorial4recylerviewbindingadapter.adapter

import android.databinding.DataBindingUtil
import android.databinding.ViewDataBinding
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup

import com.example.tutorial4recylerviewbindingadapter.BR

abstract class MyBaseAdapter : RecyclerView.Adapter<MyBaseAdapter.MyViewHolder>() {

    inner class MyViewHolder(// each data item is just a string in this case
            private val binding: ViewDataBinding) : RecyclerView.ViewHolder(binding.root) {

        fun bind(obj: Any) {
            binding.setVariable(BR.obj, obj)
            binding.executePendingBindings()
        }
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        // create a new view
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = DataBindingUtil.inflate<ViewDataBinding>(layoutInflater, getLayoutIdForType(viewType), parent, false)
        // set the view's size, margins, paddings and layout parameters
        return MyViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bind(getDataAtPosition(position))
    }

    /**
     * Get data in position for RecyclerView row. This method is invoked inside onBindViewHolder() method of RecyclerView
     *
     * @param position indicates the item for the current row
     * @return data for the current row
     */
    abstract fun getDataAtPosition(position: Int): Any

    /**
     * Get id of layout from R. This method is invoked from onCreateViewHolder method of Adapter
     *
     * @param viewType id of layout row of RecyclerView
     * @return id of layout
     */
    abstract fun getLayoutIdForType(viewType: Int): Int
}
