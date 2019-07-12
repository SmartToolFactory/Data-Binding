package com.smarttoolfactory.tutorial4recyclerviewwithclicklistener.adapter;

/*
  1- Inflate layout and create binding object with DataBindingUtil.inflate inside onCreateViewHolder() and create ViewHolder
  2- Get binding object inside constructor of MyViewHolder constructor
  3- Bind items to rows inside onCreateViewHolder() method
 */

import com.smarttoolfactory.tutorial4recyclerviewwithclicklistener.R;
import com.smarttoolfactory.tutorial4recyclerviewwithclicklistener.model.ActivityClassModel;
import java.util.List;

public class MyAdapter extends BaseAdapter {

    private List<ActivityClassModel> data;

    // Provide a suitable constructor (depends on the kind of dataset)
    public MyAdapter(List<ActivityClassModel> dataSet) {
        data = dataSet;
    }

    @Override
    public Object getDataAtPosition(int position) {
        return data.get(position);
    }


    @Override
    public int getLayoutIdForType(int viewType) {
        return R.layout.rowlayout;
    }


    @Override
    public int getItemCount() {
        return data.size();
    }
}

