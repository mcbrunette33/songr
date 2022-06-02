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

    public Album(String title, String artist, int length, int songCount, String imgUrl){
        this.title = title;
        this.artist = artist;
        this.length = length;
        this.songCount = songCount;
        this.imgUrl = imgUrl;
    }
    public Album(){

    }
}
