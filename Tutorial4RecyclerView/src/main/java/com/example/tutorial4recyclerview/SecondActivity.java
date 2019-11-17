package com.example.tutorial4recyclerview;

import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

import com.example.tutorial4recyclerview.adapter.MyAdapter;
import com.example.tutorial4recyclerview.databinding.ActivitySecondBinding;

import java.util.Arrays;
import java.util.List;

public class SecondActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivitySecondBinding activitySecondBinding = DataBindingUtil.setContentView(this, R.layout.activity_second);

        RecyclerView recyclerView = activitySecondBinding.myRecyclerView;

        // use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        recyclerView.setHasFixedSize(true);

        // use a linear layout manager
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        final List<TemperatureData> items = Arrays.asList(new TemperatureData("Hamburg", "5"),
                new TemperatureData("Berlin", "6"));

        // define an adapter
        RecyclerView.Adapter adapter = new MyAdapter(items);
        recyclerView.setAdapter(adapter);

        activitySecondBinding.buttonUpdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                items.get(0).setLocation("Istanbul");
                items.get(0).setCelsius("27");
            }
        });
    }
}