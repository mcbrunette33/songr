package com.mikebrunette401.songr.controllers;

import java.util.ArrayList;
import java.util.List;

public class Album {
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
    public List<Album> createAlbum(){
        List<Album> newAlbum = new ArrayList<>();
        newAlbum.add("Fire on the Horizon", "Stick Figure", 700, 2, "ff");
        newAlbum.add("Choice is Yours", "Stick Figure", 700, 3, "ff");
        newAlbum.add("World on Fire", "Stick Figure", 700, 7, "ff");
    }
}
