package com.smarttoolfactory.tutorial4recyclerviewwithclicklistener;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.smarttoolfactory.tutorial4recyclerviewwithclicklistener.adapter.BaseAdapter;
import com.smarttoolfactory.tutorial4recyclerviewwithclicklistener.adapter.MyAdapter;
import com.smarttoolfactory.tutorial4recyclerviewwithclicklistener.databinding.ActivityMainBinding;
import com.smarttoolfactory.tutorial4recyclerviewwithclicklistener.model.ActivityClassModel;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements BaseAdapter.OnRecyclerViewItemClickListener {


    private List<ActivityClassModel> activityClassModels = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setTitle("MainActivity");

        ActivityMainBinding activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        // Add Activities to list on RecyclerView
        activityClassModels.add(new ActivityClassModel(Activity1.class));
        activityClassModels.add(new ActivityClassModel(Activity2.class));
        activityClassModels.add(new ActivityClassModel(Activity3.class));

        RecyclerView recyclerView = activityMainBinding.recyclerView;

        // use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        recyclerView.setHasFixedSize(true);

        // use a linear layout manager
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);


        recyclerView.addItemDecoration(new DividerItemDecoration(this,
                DividerItemDecoration.VERTICAL));

        // define an adapter
        MyAdapter adapter = new MyAdapter(activityClassModels);
        recyclerView.setAdapter(adapter);
        adapter.setOnItemClickListener(this);


    }

    @Override
    public void onItemClicked(View view, int position) {

        Intent intent = new Intent(MainActivity.this, activityClassModels.get(position).getClazz());
        startActivity(intent);

    }
}
