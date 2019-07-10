package com.pitrens.notes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.widget.LinearLayout;

import com.pitrens.notes.adapters.NotesRecyclerAdapter;
import com.pitrens.notes.models.Note;
import com.pitrens.notes.util.VerticalSpacingItemDecorator;

import java.util.ArrayList;
import java.util.Date;

public class NotesListActivity extends AppCompatActivity {

  private static final String TAG = "NotesListActivity";
  private RecyclerView mRecyclerView;

  private ArrayList<Note> mNotes = new ArrayList<>();
  private NotesRecyclerAdapter mNoteRecyclerAdapter;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_notes_list);

    mRecyclerView = findViewById(R.id.recyclerView);

    initRecyclerView();
    createNote();

  }

  private void createNote(){

    for(int i = 0 ; i < 100; i++){
      Note note = new Note(i + " notes" , "This is a note" , "July 2019");
      mNotes.add(note);
    }

    mNoteRecyclerAdapter.notifyDataSetChanged();
  }

  private void initRecyclerView(){
    LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
    mRecyclerView.setLayoutManager(linearLayoutManager);
    VerticalSpacingItemDecorator itemDecorator = new VerticalSpacingItemDecorator(10);

    mNoteRecyclerAdapter = new NotesRecyclerAdapter(mNotes);
    mRecyclerView.addItemDecoration(itemDecorator);
    mRecyclerView.setAdapter(mNoteRecyclerAdapter);
  }

}
