package com.example.ireneapplication;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.ireneapplication.database.DatabaseHelper;
import com.example.ireneapplication.database.Note;

public class AddNoteActivity extends AppCompatActivity {
    EditText etTitle;
    EditText etNote;
    Button btnAddPhoto;
    Button btnAddVoicePhoto;
    Button btnSave;
    String title;
    String noteText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_note);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        etTitle = findViewById(R.id.etTitle);
        etNote = findViewById(R.id.etNote);
        btnAddPhoto = findViewById(R.id.btnAddPhoto);
        btnAddVoicePhoto = findViewById(R.id.btnAddVoiceNote);
        btnSave = findViewById(R.id.btnSave);


        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                title =etTitle.getText().toString();
                noteText = etNote.getText().toString();
                Note note = new Note(noteText,title);
                DatabaseHelper databaseHelper = new DatabaseHelper(getBaseContext(),"notes",null,1);
                long insert = databaseHelper.insertNote(note);
                Log.d("inserNote","note insertion value"+ insert);


           Toast.makeText(getBaseContext(), "You have clicked the save button",Toast.LENGTH_LONG).show();

            }
        });

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
