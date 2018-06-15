package com.example.tutorial3obeservables2;

import android.databinding.ObservableField;

public class User {
    public final ObservableField<String> name = new ObservableField<>();
    public final ObservableField<String> email = new ObservableField<>();
}