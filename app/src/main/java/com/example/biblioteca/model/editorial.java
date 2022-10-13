package com.example.biblioteca.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class editorial {
    @SerializedName("ideditorial")
    @Expose
    private int ideditorial;

    @SerializedName("nombre")
    @Expose
    private String nombre;

    public editorial(){

    }

    public editorial(int ideditorial, String nombre) {
        this.ideditorial = ideditorial;
        this.nombre = nombre;
    }

    public int getId() {
        return ideditorial;
    }

    public void setId(int id) {
        this.ideditorial = ideditorial;
    }

    public String getNombres() {
        return nombre;
    }

    public void setNombres(String nombre) {
        this.nombre = nombre;
    }


}
