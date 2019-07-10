package com.pitrens.notes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.pitrens.notes.models.Note;

import java.util.Date;

public class NotesListActivity extends AppCompatActivity {

  private static final String TAG = "NotesListActivity";

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_notes_list);

    Note note = new Note();
    Note note2 = new Note("My First Note","This is my first note content", "The timeStamp");

    Log.d(TAG, "onCreate: "+ note.toString());
    Log.d(TAG, "onCreate: "+ note2.toString());
  }

}
