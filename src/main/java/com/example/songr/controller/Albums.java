package com.example.songr.controller;


import com.example.songr.repositories.AlbumRepository;
import com.example.songr.model.Album;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;


@Controller
public class Albums {

    @Autowired
    AlbumRepository albumRepository;


    @GetMapping("/albums")
    public String albums(Model model){
        model.addAttribute("albums",albumRepository.findAll());
        return "album.html";
    }



    @PostMapping("/newAlbum")
    public RedirectView addAlbum(@ModelAttribute Album newAlbum){
        albumRepository.save(newAlbum);
        return new RedirectView("/albums");
    }







}
