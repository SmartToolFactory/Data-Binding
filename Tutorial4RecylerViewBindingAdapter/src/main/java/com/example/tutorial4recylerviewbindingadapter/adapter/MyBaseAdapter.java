package com.example.tutorial4recylerviewbindingadapter.adapter;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.example.tutorial4recylerviewbindingadapter.BR;

public abstract class MyBaseAdapter extends RecyclerView.Adapter<MyBaseAdapter.MyViewHolder> {

    public class MyViewHolder extends RecyclerView.ViewHolder {
        // each data item is just a string in this case
        private final ViewDataBinding binding;

        public MyViewHolder(ViewDataBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        public void bind(Object obj) {
            binding.setVariable(BR.obj, obj);
            binding.executePendingBindings();
        }
    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // create a new view
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        ViewDataBinding binding = DataBindingUtil.inflate(layoutInflater, getLayoutIdForType(viewType), parent, false);
        // set the view's size, margins, paddings and layout parameters
        return new MyViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.bind(getDataAtPosition(position));
    }

    /**
     * Get data in position for RecyclerView row. This method is invoked inside onBindViewHolder() method of RecyclerView
     *
     * @param position indicates the item for the current row
     * @return data for the current row
     */
    public abstract Object getDataAtPosition(int position);

    /**
     * Get id of layout from R. This method is invoked from onCreateViewHolder method of Adapter
     *
     * @param viewType id of layout row of RecyclerView
     * @return id of layout
     */
    public abstract int getLayoutIdForType(int viewType);
}
