package com.example.biblioteca.utils;

public class Apis {

    public static final String URL_001="http://172.17.7.6:3000/categorias";

    public static com.example.biblioteca.utils.editorialService getcategoriasService(){
        return  Cliente.getClient(URL_001).create(com.example.biblioteca.utils.editorialService.class);
    }

    public static com.example.biblioteca.utils.libroService getlibroService(){
        return  Cliente.getClient(URL_001).create(com.example.biblioteca.utils.libroService.class);
    }
}
