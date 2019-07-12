package com.smarttoolfactory.tutorial4recyclerviewwithclicklistener;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

public class Activity1 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity1);

        Toast.makeText(this, this.getClass().getSimpleName(), Toast.LENGTH_SHORT).show();


    }


}
