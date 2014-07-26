package com.fr4gus.android.savenotes;

import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.fr4gus.backend.savenotes.noteEndpoint.NoteEndpoint;
import com.fr4gus.backend.savenotes.noteEndpoint.model.Note;
import com.fr4gus.backend.savenotes.userEndpoint.model.User;
import com.google.api.client.extensions.android.http.AndroidHttp;
import com.google.api.client.extensions.android.json.AndroidJsonFactory;
import com.google.api.client.googleapis.services.AbstractGoogleClientRequest;
import com.google.api.client.googleapis.services.GoogleClientRequestInitializer;

import java.io.IOException;


public class NotesActivity extends BaseActivity implements View.OnClickListener {

    EditText mNoteContent;
    Button mSaveNote;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notes);

        mNoteContent = (EditText) findViewById(R.id.note_content);
        mSaveNote = (Button) findViewById(R.id.action_save);

        mSaveNote.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.action_save) {
            String noteContent = mNoteContent.getText().toString();

            // Do nothing if content is empty
            if (TextUtils.isEmpty(noteContent))
                return;

            new AsyncTask<String, Void, Boolean>() {
                @Override
                protected Boolean doInBackground(String... params) {
                    String content = params[0];

                    NoteEndpoint.Builder noteBuilder = new NoteEndpoint.Builder(AndroidHttp.newCompatibleTransport(), new AndroidJsonFactory(), null);

                    noteBuilder.setApplicationName(APP_NAME);

                    //TODO Use only for local test. Remove for production
                    noteBuilder.setRootUrl(TEST_ROOT_URL);
                    noteBuilder.setGoogleClientRequestInitializer(new GoogleClientRequestInitializer() {
                        @Override
                        public void initialize(AbstractGoogleClientRequest<?> abstractGoogleClientRequest) throws IOException {
                            abstractGoogleClientRequest.setDisableGZipContent(true);
                        }
                    });

                    NoteEndpoint noteService = noteBuilder.build();

                    Note note = new Note();
                    note.setContent(content);

                    User currentUser = SaveNotesApplication.getInstance().getCurrentUser();
                    note.setUserId(currentUser.getId());
                    try {
                        noteService.insertNote(note).execute();
                    } catch (IOException e) {
                        Log.e(TAG, e.getMessage(), e);
                        return false;
                    }
                    return true;
                }

                @Override
                protected void onPostExecute(Boolean result) {
                    if (result){
                        mNoteContent.setText("");
                    } else {
                        Toast.makeText(NotesActivity.this, R.string.error_send_note, Toast.LENGTH_SHORT).show();
                    }
                }
            }.execute(noteContent);

        }
    }
}
