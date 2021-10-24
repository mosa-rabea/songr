package com.example.songr;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class Capitalize {

    @GetMapping("/capitalize/{word}")
    public String capitalize(Model model, @PathVariable(value="word") String word){
        String upperCase =  word.toUpperCase();

        model.addAttribute("word", upperCase);
        return "capitalize";
    }
}
