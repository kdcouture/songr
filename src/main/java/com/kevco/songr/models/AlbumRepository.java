package com.kevco.songr.models;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlbumRepository  extends JpaRepository<Album, Long>{
    public Album findByTitle(String title);
}