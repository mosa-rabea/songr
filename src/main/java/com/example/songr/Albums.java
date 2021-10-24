package com.example.songr;


import com.example.songr.model.ModelAlbum;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class Albums {

    @GetMapping("/albums")
    public static String albums(Model model){


        model.addAttribute("albums", Arrays.asList(
                new ModelAlbum("Al Hawa Sultan","George Wassouf",7,40000,"https://img.discogs.com/Bza9Rew6GRW3_S4PCggc0ARbv8w=/fit-in/600x600/filters:strip_icc():format(jpeg):mode_rgb():quality(90)/discogs-images/R-5729396-1630339075-3484.jpeg.jpg"),
                new ModelAlbum("Laiel El Ashekin","George Wassouf",6,40000,"https://img.discogs.com/CbY4zUgiLwPRaMQkf6PfV_XfCRc=/fit-in/345x336/filters:strip_icc():format(jpeg):mode_rgb():quality(90)/discogs-images/R-4180813-1357817356-2432.jpeg.jpg"),
                new ModelAlbum("Sert Al-7ob","Om kolthom",3,36000,"https://esm3cdn.com/singers/albums/12870.gif")
        ));
        return "albumsHtml";
    }

}
