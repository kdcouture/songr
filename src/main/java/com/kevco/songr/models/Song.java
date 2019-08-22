package com.kevco.songr.models;



import javax.persistence.*;

@Entity
public class Song {
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     long id;

     String title;

     @ManyToOne
     Album album;

     long length;
     int trackNumber;

     public Song(){};

     public Song(String title, Album album, long length, int trackNumber) {
          this.title = title;
          this.album = album;
          this.length = length;
          this.trackNumber = trackNumber;
     }

     public long getId() {
          return id;
     }

     public String getTitle() {
          return title;
     }

     public Album getAlbum() {
          return album;
     }

     public long getLength() {
          return length;
     }

     public int getTrackNumber() {
          return trackNumber;
     }
}
