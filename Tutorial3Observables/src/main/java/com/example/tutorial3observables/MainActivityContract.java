package com.example.tutorial3observables;

import com.example.tutorial3observables.TemperatureData;

public interface MainActivityContract {
    public interface Presenter {
        void onShowData(TemperatureData temperatureData);
    }

    public interface View {
        void showData(TemperatureData temperatureData);
    }

}