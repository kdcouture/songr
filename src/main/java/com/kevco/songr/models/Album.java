package com.kevco.songr.models;

import javax.persistence.*;
import java.util.List;

@Entity
public class Album {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    @OneToMany (fetch = FetchType.EAGER, mappedBy = "album")
    List<Song> songs;

    String title;
    String artist;
    int songCount;
    long length;
    String imgURL;

    public Album() {}
    public Album (String title, String artist, int songCount, long length, String imgURL){
        this.title = title;
        this.artist = artist;
        this.songCount = songCount;
        this.length = length;
        this.imgURL = imgURL;
    }

    public String getArtist() {
        return artist;
    }

    public long getId() {
        return this.id;
    }

    public String getTitle() {
        return title;
    }

    public int getSongCount() {
        return this.songCount;
    }

    public long getLength() {
        return this.length;
    }

    public String getImgURL() {
        return this.imgURL;
    }

    @Override
    public String toString() {
        return this.title;
    }
}
