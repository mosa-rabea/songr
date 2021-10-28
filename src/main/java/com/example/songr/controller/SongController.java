package com.example.songr.controller;

import com.example.songr.model.Song;
import com.example.songr.repositories.AlbumRepository;
import com.example.songr.repositories.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller

public class SongController {
    @Autowired
    AlbumRepository albumRepository;

    @GetMapping("/songs")
    public String getAllCars(Model model){
        List<Song> allSongs = (ArrayList) SongRepository.findAll();
        model.addAttribute("allSongs", allSongs);
        return "index";
    }
}
