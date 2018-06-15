package com.example.tutorial2;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.example.tutorial2.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private MyClickHandlers handlers;
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Binding
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        setSupportActionBar(binding.toolbar);

        // Create User and bind it to views
        User user = new User();
        user.setName("John");
        user.setEmail("mail@abc.com");
        binding.setUser(user);

        // Create a handler for touch events and bind it
        handlers = new MyClickHandlers(this);
        binding.content.setHandlers(handlers);


    }

    public class MyClickHandlers {

        Context context;

        MyClickHandlers(Context context) {
            this.context = context;
        }

        public void onFabClicked(View view) {
            Toast.makeText(getApplicationContext(), "FAB clicked!", Toast.LENGTH_SHORT).show();
        }

        public void onButtonClick(View view) {
            Toast.makeText(getApplicationContext(), "Button clicked!", Toast.LENGTH_SHORT).show();
            User user = new User();
            user.setName("Elsa");
            user.setEmail("mail@zcv.com");
            // Bind another user to view
            binding.setUser(user);
        }

        public void onButtonClickWithParam(View view, User user) {
            Toast.makeText(getApplicationContext(), "Button clicked! Name: " + user.name, Toast.LENGTH_SHORT).show();
        }

        public boolean onButtonLongPressed(View view) {
            Toast.makeText(getApplicationContext(), "Button long pressed!", Toast.LENGTH_SHORT).show();
            return false;
        }
    }

}
