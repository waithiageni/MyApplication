package com.example.ireneapplication.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.ireneapplication.R;
import com.example.ireneapplication.database.Note;

import java.util.List;

public class NotesAdapter extends ArrayAdapter<Note> {

    public NotesAdapter(Context context, int resource, List<Note> notes) {
        super(context, resource, notes);
    }


    @Override
    public View getView(int position, View convertView,ViewGroup parent) {
        Note note = getItem(position);
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.note_list_item,parent,false);
        }

        TextView textViewTitle = convertView.findViewById(R.id.textViewTitle);
        TextView textViewNoteText = convertView.findViewById(R.id.textViewNoteText);
        textViewTitle.setText(note.getTitle());
        textViewNoteText.setText(note.getNoteText());

        return convertView;



//        return super.getView(position, convertView, parent);
    }
}
