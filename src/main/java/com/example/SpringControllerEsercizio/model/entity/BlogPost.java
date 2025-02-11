package com.example.SpringControllerEsercizio.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalTime;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class BlogPost {
    private long id;
    private String categoria;
    private String titolo;
    private String cover = null;
    private String contenuto;
    private int tempoDiLettura;

    public BlogPost(String categoria, String titolo, String cover, String contenuto, int tempoDiLettura) {
        this.categoria = categoria;
        this.titolo = titolo;
        this.cover = cover;
        this.contenuto = contenuto;
        this.tempoDiLettura = tempoDiLettura;
    }
}
