package com.example.tutorial4recylerviewbindingadapter;

import com.example.tutorial4recylerviewbindingadapter.model.TemperatureData;

public interface MainActivityContract {
    public interface Presenter {
        void onShowData(TemperatureData temperatureData);
        void showList();
    }

    public interface View {
        void showData(TemperatureData temperatureData);
    }

}