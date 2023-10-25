package com.example.peliculasjsonentregable;

import java.io.Serializable;
import java.util.List;

public class Pelicula implements Serializable {
    private String titulo;
    private String director;
    private List<String> actores;
    private String portada;

    public Pelicula(String titulo, String director, List<String> actores, String portada) {
        this.titulo = titulo;
        this.director = director;
        this.actores = actores;
        this.portada = portada;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public List<String> getActores() {
        return actores;
    }

    public void setActores(List<String> actores) {
        this.actores = actores;
    }

    public String getPortada() {
        return portada;
    }

    public void setPortada(String portada) {
        this.portada = portada;
    }
}
