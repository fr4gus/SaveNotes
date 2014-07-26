package com.fr4gus.android.savenotes;

import android.app.Application;

import com.fr4gus.backend.savenotes.userEndpoint.model.User;

public class SaveNotesApplication extends Application {
    static SaveNotesApplication sInstance;

    User mCurrentUser;

    @Override
    public void onCreate() {
        super.onCreate();
        sInstance = this;
    }

    public static SaveNotesApplication getInstance() {
        return sInstance;
    }

    public User getCurrentUser() {
        return mCurrentUser;
    }

    public void setCurrentUser(User currentUser) {
        mCurrentUser = currentUser;
    }
}
