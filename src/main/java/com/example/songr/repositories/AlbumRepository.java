package com.example.songr.repositories;

import com.example.songr.model.Album;
import org.springframework.data.repository.CrudRepository;

public interface AlbumRepository extends CrudRepository<Album,Integer> {
}
