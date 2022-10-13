package com.example.biblioteca.utils;

import com.example.biblioteca.model.libro;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface libroService {
    @GET("listar")
    Call<List<libro>> getlibro();

    @POST("insertar")
    Call<libro>addlibro(@Body libro libro);

    @POST("modificar/{id}")
    Call<libro>updatelibro(@Body libro libro,@Path("idlibro") int id);

    @POST("eliminar/{id}")
    Call<libro>deletelibro(@Path("idlibro")int id);

}
