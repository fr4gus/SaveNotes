package com.fr4gus.android.savenotes;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class NotesActivity extends ActionBarActivity implements View.OnClickListener {
    EditText mNoteContent;
    Button mSaveNote;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notes);

        mNoteContent = (EditText) findViewById(R.id.note_content);
        mSaveNote = (Button) findViewById(R.id.action_save);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.action_save) {
            String noteContent = mNoteContent.getText().toString();

            // TODO call save on backend

            // TODO when save is finished clear the textview and show a toast message
        }
    }
}
