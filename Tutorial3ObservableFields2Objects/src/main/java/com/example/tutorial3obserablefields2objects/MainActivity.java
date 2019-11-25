package com.example.tutorial3obserablefields2objects;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.example.tutorial3obserablefields2objects.databinding.ActivityMainBinding;

/*
 - User data is changed when edit text is changed
 - When changeUserName() is called, UI is not updated. Because updating old object is not sufficient for UI update.
 notifyChange() should be called for UI update in this case.
 - UI is changed when  userObservableField.set() is called with new user object.
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
