package com.example.biblioteca.utils;

import com.example.biblioteca.model.editorial;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface editorialService {

    @GET("listar")
    Call<List<editorial>> getcategorias();

    @POST("insertar")
    Call<editorial>addeditorial(@Body editorial editorial);

    @POST("modificar/{id}")
    Call<editorial>updateeditorial(@Body editorial categorias,@Path("ideditorial") int id);

    @POST("eliminar/{id}")
    Call<editorial>deleteeditorial(@Path("ideditorial")int id);
}
