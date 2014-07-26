package com.fr4gus.android.savenotes;

import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;

import com.fr4gus.backend.savenotes.userEndpoint.UserEndpoint;
import com.fr4gus.backend.savenotes.userEndpoint.model.User;
import com.google.api.client.extensions.android.http.AndroidHttp;
import com.google.api.client.extensions.android.json.AndroidJsonFactory;
import com.google.api.client.googleapis.services.AbstractGoogleClientRequest;
import com.google.api.client.googleapis.services.GoogleClientRequestInitializer;

import java.io.IOException;

public class BaseActivity extends ActionBarActivity {
    public static final String TAG = "SaveNotes";

    public static final String APP_NAME = SaveNotesApplication.getInstance().getString(R.string.app_name);
    public static final String TEST_ROOT_URL = "http://192.168.1.140:8080/_ah/api";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        final String deviceId = DeviceUtil.getDeviceId(this);

        User currentUser = SaveNotesApplication.getInstance().getCurrentUser();
        if (currentUser == null) {
            new AsyncTask<String,Void,Boolean>(){
                @Override
                protected Boolean doInBackground(String... params) {
                    UserEndpoint.Builder userBuilder = new UserEndpoint.Builder(AndroidHttp.newCompatibleTransport(), new AndroidJsonFactory(),null);
                    userBuilder.setApplicationName(APP_NAME);
                    userBuilder.setRootUrl(TEST_ROOT_URL);
                    userBuilder.setGoogleClientRequestInitializer(new GoogleClientRequestInitializer() {
                        @Override
                        public void initialize(AbstractGoogleClientRequest<?> abstractGoogleClientRequest) throws IOException {
                            abstractGoogleClientRequest.setDisableGZipContent(true);
                        }
                    });

                    UserEndpoint userService = userBuilder.build();

                    try {
                        User user = userService.findUser(deviceId).execute();
                        SaveNotesApplication.getInstance().setCurrentUser(user);
                    } catch (IOException e) {
                        Log.e(TAG,e.getMessage(),e);
                        return false;
                    }


                    return true;
                }
            }.execute(deviceId);
        }
    }
}
