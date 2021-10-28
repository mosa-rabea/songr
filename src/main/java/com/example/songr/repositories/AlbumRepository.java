package com.example.songr.repositories;

import com.example.songr.model.ModelAlbum;
import org.springframework.data.repository.CrudRepository;

public interface AlbumRepository extends CrudRepository<ModelAlbum,Integer> {
}
