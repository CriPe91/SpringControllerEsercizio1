package com.example.SpringControllerEsercizio.controller;

import com.example.SpringControllerEsercizio.model.entity.BlogPost;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/blogPosts")

public class BlogController {

    @PostMapping("/nuovo")
    @ResponseStatus(HttpStatus.CREATED)
    public List<BlogPost> nuovoBlog(@RequestBody List<BlogPost> blogPost){
    List<BlogPost> listaBlog = new ArrayList<>();

        BlogPost blogCreato = new BlogPost();
        blogCreato.setCategoria("Viaggi");
        blogCreato.setTitolo("Mare");
        blogCreato.setContenuto("Le spiaggie piu belle");
        blogCreato.setTempoDiLettura(8);

        listaBlog.add(blogCreato);
        return listaBlog;


    }



}
