package com.kevco.songr.controllers;

import com.kevco.songr.models.Album;
import com.kevco.songr.models.AlbumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@Controller
public class AlbumController {

    @Autowired
    AlbumRepository albumRepository;

    @GetMapping("/albums")
    public String getAllAlbums(Model m) {
        List<Album> albums = albumRepository.findAll();
        m.addAttribute("albums", albums);
        return "allAlbums";
    }

    @PostMapping("/albums")
    public RedirectView addAlbum(String title, String artist, int songCount, long length, String imgURL) {
        Album a = new Album(title,artist,songCount,length,imgURL);
        albumRepository.save(a);
        return new RedirectView("/albums");
    }
}