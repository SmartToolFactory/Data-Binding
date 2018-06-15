package com.example.tutorial4recylerviewbindingadapter;

import android.content.Context;
import android.content.Intent;

import com.example.tutorial4recylerviewbindingadapter.model.TemperatureData;

public class MainActivityPresenter implements MainActivityContract.Presenter {
    private MainActivityContract.View mView;
    private Context mContext;

    public MainActivityPresenter(MainActivityContract.View view, Context context) {
        mView = view;
        mContext = context;

    }

    @Override
    public void onShowData(TemperatureData temperatureData) {
        mView.showData(temperatureData);
    }

    @Override
    public void showList() {

        Intent i = new Intent(mContext, SecondActivity.class);
        mContext.startActivity(i);

    }
}
