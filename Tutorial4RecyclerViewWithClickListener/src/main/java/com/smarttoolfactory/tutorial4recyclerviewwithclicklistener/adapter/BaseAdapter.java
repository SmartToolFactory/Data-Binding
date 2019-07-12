package com.smarttoolfactory.tutorial4recyclerviewwithclicklistener.adapter;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.smarttoolfactory.tutorial4recyclerviewwithclicklistener.BR;

/*
  1- Inflate layout and create binding object with DataBindingUtil.inflate inside onCreateViewHolder() and create ViewHolder
  2- Get binding object inside constructor of MyViewHolder constructor
  3- Bind items to rows inside onCreateViewHolder() method
 */

public abstract class BaseAdapter extends RecyclerView.Adapter<BaseAdapter.MyViewHolder> {

    OnRecyclerViewItemClickListener listener;

    public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        // each data item is just a string in this case
        private final ViewDataBinding binding;

        // TODO #2
        public MyViewHolder(ViewDataBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        // TODO #3
        void bind(Object obj) {
            binding.setVariable(BR.obj, obj);
            binding.executePendingBindings();

            // Set click listener
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            if (listener != null) {
                listener.onItemClicked(v, getAdapterPosition());
            }
        }
    }

    // TODO #1
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // create a new view
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        ViewDataBinding binding = DataBindingUtil.inflate(layoutInflater, getLayoutIdForType(viewType), parent, false);
        // set the view's size, margins, paddings and layout parameters
        return new MyViewHolder(binding);
    }

    // TODO #3
    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.bind(getDataAtPosition(position));
    }

    // TODO #3
    /**
     * Get data in position for RecyclerView row. This method is invoked inside onBindViewHolder() method of RecyclerView
     *
     * @param position indicates the item for the current row
     * @return data for the current row
     */
    public abstract Object getDataAtPosition(int position);

    // TODO #1
    /**
     * Get id of layout from R. This method is invoked from onCreateViewHolder method of Adapter
     *
     * @param viewType id of layout row of RecyclerView
     * @return id of layout
     */
    public abstract int getLayoutIdForType(int viewType);

    /**
     * RecyclerViewClickListener interface helps user to set a clickListener to the
     * RecyclerView. By setting this listener, any item of Recycler View can respond
     * to any interaction.
     */
    public interface OnRecyclerViewItemClickListener {
        /**
         * This is a callback method that be overridden by the class that implements this
         * interface
         */
        public void onItemClicked(View view, int position);
    }

    public  void setOnItemClickListener(OnRecyclerViewItemClickListener listener) {
        this.listener = listener;
    };
}