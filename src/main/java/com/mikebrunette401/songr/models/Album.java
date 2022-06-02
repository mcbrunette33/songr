package com.mikebrunette401.songr.models;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;
@Entity
public class Album {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    public String title;
    public String artist;
    public int length;
    public String imgUrl;
    public int songCount;

@OneToMany (mappedBy = "thisAlbum")
List <Song> trackList;

    public Album(String title, String artist, int length, int songCount, String imgUrl){
        this.title = title;
        this.artist = artist;
        this.length = length;
        this.songCount = songCount;
        this.imgUrl = imgUrl;
    }
    public Album(){

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public int getSongCount() {
        return songCount;
    }

    public void setSongCount(int songCount) {
        this.songCount = songCount;
    }
}
