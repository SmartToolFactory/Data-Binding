package com.example.tutorial3obserablefields2objects;


import android.databinding.ObservableField;

public class ViewModel {
    public ObservableField<User> userObservableField = new ObservableField<>();
    private User mUser;

    public ViewModel() {
        mUser = new User("User", "asd@abc.com");
        userObservableField.set(mUser);
    }

    public void changeUserName() {
        mUser.setName("New Name");
        userObservableField.get().setName("Changed Name");
        userObservableField.get().setEmail("changed@abc.com");
        // userObservableField.notifyChange(); // this line is needed for updating observable field
    }

    public void changeUser() {

        // Updates UI
        mUser = new User("New Observable User", "new@xyz.com");

        // Does not update UI
        // mUser.setName("NAME");
        // mUser.setName("NEW@zcc.com");

        userObservableField.set(mUser);
    }

}
