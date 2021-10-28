package com.example.songr.model;

import javax.persistence.*;

@Entity
public class Song {

    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;
    private int length;
    private int trackNumber;
    @ManyToOne
    private ModelAlbum album;


    public Song(){

    }

    public Song(String title, int length, int trackNumber, ModelAlbum album) {
        this.title = title;
        this.length = length;
        this.trackNumber = trackNumber;
        this.album = album;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getTrackNumber() {
        return trackNumber;
    }

    public void setTrackNumber(int trackNumber) {
        this.trackNumber = trackNumber;
    }

    public ModelAlbum getAlbum() {
        return album;
    }

    public void setAlbum(ModelAlbum album) {
        this.album = album;
    }
}