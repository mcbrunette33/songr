package com.mikebrunette401.songr.controllers;

import com.mikebrunette401.songr.models.Album;
import com.mikebrunette401.songr.repositories.AlbumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;
import java.util.List;

@Controller
@RequestMapping("/album")
public class AlbumController {
@Autowired
    AlbumRepository albumRepository;
//    @GetMapping("/")
//    public String album (Model model){
//        Album album1 = new Album("Set in Stone", "Stick Figure", 3213, 14, "https://f4.bcbits.com/img/a2162580587_10.jpg");
//        Album album2 = new Album("Courage to Grow", "Rebelution", 1122, 11, "https://m.media-amazon.com/images/I/51l-4Ui41fL.jpg");
//        Album album3 = new Album("American IV: The Man Comes Around", "Johnny Cash", 8400, 18, "https://m.media-amazon.com/images/I/41y-zbhdJCL._SY580_.jpg");
//        ArrayList<Album> albumList = new ArrayList<>();
//        albumList.add(album1);
//        albumList.add(album2);
//        albumList.add(album3);
//        model.addAttribute("albums",albumList);
//        return "album";
//    }
    @GetMapping("/")
    public String album (Model model){
        List<Album> list = albumRepository.findAll();
        model.addAttribute("albums",list);
        return "album";
    }

    @PostMapping ("addAlbum")
    public RedirectView addAlbum (String title, String artist, int length, String imgUrl, int songCount){
        Album newAlbum = new Album(title, artist, length, songCount, imgUrl);
        albumRepository.save(newAlbum);
        return new RedirectView("/album/");
    }

}
