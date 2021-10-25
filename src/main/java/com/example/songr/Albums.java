package com.example.songr;


import com.example.songr.model.AlbumRepository;
import com.example.songr.model.ModelAlbum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.servlet.view.RedirectView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class Albums {


@Autowired
    AlbumRepository albumRepository;

    @GetMapping("/albums")
    public String albums(Model model){
ArrayList<ModelAlbum> albumsData=(ArrayList<ModelAlbum>) albumRepository.findAll();
        model.addAttribute("albums",albumsData);
        return "albumsHtml.html";
    }

//    @GetMapping("/addAlbum")
//    public RedirectView addAlbum(){
//
//        ModelAlbum album1=  new ModelAlbum("Al Hawa Sultan","George Wassouf","7","40000","https://img.discogs.com/Bza9Rew6GRW3_S4PCggc0ARbv8w=/fit-in/600x600/filters:strip_icc():format(jpeg):mode_rgb():quality(90)/discogs-images/R-5729396-1630339075-3484.jpeg.jpg");
//        ModelAlbum album2  =new ModelAlbum("Laiel El Ashekin","George Wassouf","6","40000","https://img.discogs.com/CbY4zUgiLwPRaMQkf6PfV_XfCRc=/fit-in/345x336/filters:strip_icc():format(jpeg):mode_rgb():quality(90)/discogs-images/R-4180813-1357817356-2432.jpeg.jpg");
//        ModelAlbum album3=  new ModelAlbum("Sert Al-7ob","Om kolthom","3","36000","https://esm3cdn.com/singers/albums/12870.gif");
//
//        albumRepository.save(album1);
//        albumRepository.save(album2);
//        albumRepository.save(album3);
//        return new RedirectView("/albums");
//    }

    @PostMapping("/newAlbum")
    public RedirectView addAlbum(@RequestBody MultiValueMap<String, String> formData){
        ModelAlbum newAlbum = new ModelAlbum(formData.get("title").get(0),formData.get("artist").get(0),formData.get("songCount").get(0),formData.get("length").get(0),formData.get("imgUrl").get(0));

        albumRepository.save(newAlbum);
        return new RedirectView("/albums");
    }

//    public static String albums(Model model){
//
//
//        model.addAttribute("albums", Arrays.asList(
//                new ModelAlbum("Al Hawa Sultan","George Wassouf",7,40000,"https://img.discogs.com/Bza9Rew6GRW3_S4PCggc0ARbv8w=/fit-in/600x600/filters:strip_icc():format(jpeg):mode_rgb():quality(90)/discogs-images/R-5729396-1630339075-3484.jpeg.jpg"),
//                new ModelAlbum("Laiel El Ashekin","George Wassouf",6,40000,"https://img.discogs.com/CbY4zUgiLwPRaMQkf6PfV_XfCRc=/fit-in/345x336/filters:strip_icc():format(jpeg):mode_rgb():quality(90)/discogs-images/R-4180813-1357817356-2432.jpeg.jpg"),
//                new ModelAlbum("Sert Al-7ob","Om kolthom",3,36000,"https://esm3cdn.com/singers/albums/12870.gif")
//        ));
//        return "albumsHtml";
//    }

}
