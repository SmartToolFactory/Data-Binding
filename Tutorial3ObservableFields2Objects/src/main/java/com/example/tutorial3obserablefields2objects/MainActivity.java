package com.example.tutorial3obserablefields2objects;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.example.tutorial3obserablefields2objects.databinding.ActivityMainBinding;

/*
 User data is changed when edit text is changed and changeUserName() is called but UI is not updated
 UI is changed when  userObservableField.set() is called with new user object.
 Updating old object and calling userObservableField.set() does not update UI
*/
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        final ViewModel viewModel = new ViewModel();
        binding.setViewModel(viewModel);

        binding.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = binding.getViewModel().userObservableField.get().getName();
                String email = binding.getViewModel().userObservableField.get().getEmail();

                Toast.makeText(MainActivity.this, "name: " + name + ", email: " + email, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
