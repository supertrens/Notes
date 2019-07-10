package com.pitrens.notes.adapters;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.pitrens.notes.R;
import com.pitrens.notes.models.Note;

import java.util.ArrayList;

import static android.content.ContentValues.TAG;

public class NotesRecyclerAdapter extends RecyclerView.Adapter<NotesRecyclerAdapter.ViewHolder> {
  private ArrayList<Note> mNotes;

  public NotesRecyclerAdapter(ArrayList<Note> notes) {
    this.mNotes = notes;
  }

  @NonNull
  @Override
  public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
    View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_note_list_item, parent , false);
    return new ViewHolder(view);
  }

  @Override
  public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
    Log.d(TAG, "onBindViewHolder: "+position);
    holder.timestamp.setText(mNotes.get(position).getTimeStamp());
    holder.title.setText(mNotes.get(position).getTitle());
  }

  @Override
  public int getItemCount() {
    return mNotes.size();
  }

  public class ViewHolder extends RecyclerView.ViewHolder {
    TextView title, timestamp;

    public ViewHolder(@NonNull View itemView) {
      super(itemView);

      title = itemView.findViewById(R.id.note_title);
      timestamp = itemView.findViewById(R.id.note_timestamp);
    }
  }
}
