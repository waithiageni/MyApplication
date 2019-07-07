package com.example.ireneapplication.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class DatabaseHelper extends SQLiteOpenHelper {
    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "notes_db";

    public DatabaseHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE notes(id INTEGER PRIMARY KEY AUTOINCREMENT, title TEXT, noteText TEXT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
    }

    public long insertNote(Note note){
        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("title",note.getTitle());
        contentValues.put("noteText",note.getNoteText());
        Long insert = sqLiteDatabase.insert("notes",null,contentValues);
        sqLiteDatabase.close();
        return  insert;
    }

    public List<Note>getNotes(){
        List<Note> notesList=new ArrayList<Note>();
        String query = "SELECT * FROM notes";
        SQLiteDatabase sqLiteDatabase = this.getReadableDatabase();
        Cursor cursor = sqLiteDatabase.rawQuery(query,null);
        if (cursor.moveToFirst()){
            do {
                Note note = new Note();
                note.setId(cursor.getInt(cursor.getColumnIndex("id")));
                note.setTitle(cursor.getString(cursor.getColumnIndex("title")));
                note.setNoteText(cursor.getString(cursor.getColumnIndex("noteText")));
                notesList.add(note);
            }while (cursor.moveToNext());
            sqLiteDatabase.close();
        }
        return  notesList;
    }
    public Note getNoteById(int id){
        Note note = new Note();
        SQLiteDatabase sqLiteDatabase = this.getReadableDatabase();
        String query = "SELECT * FROM notes WHERE Id =?";
        Cursor cursor = sqLiteDatabase.rawQuery(query,new String[]{String.valueOf(id)});
        if (cursor.moveToFirst() == true){
            note.setId(cursor.getInt(cursor.getColumnIndex("id")));
            note.setTitle(cursor.getString(cursor.getColumnIndex("title")));
            note.setNoteText(cursor.getString(cursor.getColumnIndex("noteText")));
        }
        sqLiteDatabase.close();
        return note;
    }


}
