package com.example.databinding;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.databinding.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding dataBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //   setContentView(R.layout.activity_main);
        // Setting Content View with data binding object
        dataBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        // dataBinding.title.setText("New Title");
        //  dataBinding.description.setText("New Description");

        // Title and Description are variables inside data tag in xml
        //   dataBinding.setTitle("Initial Title");
        dataBinding.setDescription("Initial Desciption");

        dataBinding.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //  dataBinding.title.setText("Title Changed ");
                //  dataBinding.description.setText("Description Changed");

                dataBinding.setTitle("Title Changed");
                dataBinding.setDescription("Desciption Changed");
            }
        });

    }
}
