package com.mikebrunette401.songr.controllers;


import com.mikebrunette401.songr.models.Album;
import com.mikebrunette401.songr.models.Song;
import com.mikebrunette401.songr.repositories.AlbumRepository;
import com.mikebrunette401.songr.repositories.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SongController {
    @Autowired
    AlbumRepository albumRepository;
    @Autowired
    SongRepository songRepository;

    @PostMapping("/addSong")
    RedirectView addSong(String title, int length, int trackNumber, String albumTitle){
        Album album = albumRepository.findByTitle(albumTitle);
        Song addSong = new Song(title, length, trackNumber, album);
        songRepository.save(addSong);
        return new RedirectView("/album/");
    }
}
