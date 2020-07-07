package com.example.film_aplication;

public class Filmes {
    private String titulo;
    private String genero;
    private String sinopse;
    private String ano;

    public Filmes(String titulo, String genero, String sinopse, String ano) {
        this.titulo = titulo;
        this.genero = genero;
        this.sinopse = sinopse;
        this.ano = ano;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public Filmes() {
    }
}
