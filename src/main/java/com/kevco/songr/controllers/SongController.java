package com.kevco.songr.controllers;

import com.kevco.songr.models.Album;
import com.kevco.songr.models.AlbumRepository;
import com.kevco.songr.models.Song;
import com.kevco.songr.models.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@Controller
public class SongController {
    @Autowired
    SongRepository songRepository;
    @Autowired
    AlbumRepository albumRepository;

    @GetMapping("/songs")
    public String getAllSongs(Model m) {
        List<Song> songs = songRepository.findAll();
        m.addAttribute("songs", songs);
        return "allSongs";
    }

    @PostMapping("/songs")
    public RedirectView addSong(String title, String album, long length, int trackNumber) {
        Album a = albumRepository.findByTitle(album);
        if (a == null) {
            a = new Album(album, "unknown", 1, length, null);
            albumRepository.save(a);
        }
        Song s = new Song(title, a, length, trackNumber);
        songRepository.save(s);
        return new RedirectView("/songs");
    }

}
