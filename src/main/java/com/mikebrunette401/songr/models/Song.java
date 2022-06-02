package com.mikebrunette401.songr.models;

import javax.persistence.*;

@Entity
public class Song {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;
    String title;
    int length;
    int trackNumber;

    @ManyToOne
    Album thisAlbum;
    public Song (String title, int length, int trackNumber, Album album){
        this.title= title;
        this.length = length;
        this.trackNumber = trackNumber;
        thisAlbum = album;
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

    public Album getThisAlbum() {
        return thisAlbum;
    }

    public void setThisAlbum(Album thisAlbum) {
        this.thisAlbum = thisAlbum;
    }
}
