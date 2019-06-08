package com.example.ireneapplication.database;

public class Note {
    private int Id;
    private String noteText;
    private String title;

    public Note(int id, String noteText, String title) {
        Id = id;
        this.noteText = noteText;
        this.title = title;
    }

    public Note(String noteText, String title) {
        this.noteText = noteText;
        this.title = title;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getNoteText() {
        return noteText;
    }

    public void setNoteText(String noteText) {
        this.noteText = noteText;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}

