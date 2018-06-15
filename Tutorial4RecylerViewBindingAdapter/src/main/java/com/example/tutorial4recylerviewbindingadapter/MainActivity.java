package com.example.tutorial4recylerviewbindingadapter;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.example.tutorial4recylerviewbindingadapter.model.TemperatureData;
import com.example.tutorial4recylerviewbindingadapter.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity implements MainActivityContract.View {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        TemperatureData temperatureData = new TemperatureData("Istanbul", "37", "");
        binding.setTemperature(temperatureData);

        MainActivityPresenter mainActivityPresenter = new MainActivityPresenter(this, this);
        binding.setPresenter(mainActivityPresenter);
    }

    @Override
    public void showData(TemperatureData temperatureData) {
        String celsius = temperatureData.getCelsius();
        Toast.makeText(this, "Location " + temperatureData.getLocation()
                + ", temp: " + celsius, Toast.LENGTH_SHORT).show();
    }
}
