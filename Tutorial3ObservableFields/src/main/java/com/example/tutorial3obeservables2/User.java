package com.example.tutorial3obeservables2;

import android.databinding.ObservableArrayList;
import android.databinding.ObservableField;

public class User {

    // Observable Fields are required to get data from EditText with two-way binding
    public final ObservableField<String> name = new ObservableField<>();
    public final ObservableField<String> email = new ObservableField<>();
    public final ObservableArrayList<String> hobbies = new ObservableArrayList<>();

}