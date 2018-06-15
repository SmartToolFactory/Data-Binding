package com.example.tutorial4recylerviewbindingadapter.model;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.databinding.BindingAdapter;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.tutorial4recylerviewbindingadapter.BR;

public class TemperatureData extends BaseObservable {

    private String location;

    private String celsius;

    private String url;

    public TemperatureData(String location, String celsius, String url) {
        this.location = location;
        this.celsius = celsius;
        this.url = url;
    }

    @Bindable
    public String getCelsius() {
        return celsius;
    }

    @Bindable
    public String getLocation() {
        return location;
    }

    @Bindable
    public String getUrl() {
        return url;
    }


    public void setLocation(String location) {
        this.location = location;
        notifyPropertyChanged(BR.location);
    }

    public void setCelsius(String celsius) {
        this.celsius = celsius;
        notifyPropertyChanged(BR.celsius);
    }

    public void setUrl(String url) {
        this.url = url;
        notifyPropertyChanged(BR.url);
    }

    @BindingAdapter("android:src")
    public static void setImageUrl(ImageView view, String url) {
        Glide.with(view.getContext()).
                load(url).
                into(view);
    }
}