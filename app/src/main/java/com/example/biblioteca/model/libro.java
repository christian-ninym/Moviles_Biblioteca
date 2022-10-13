package com.example.biblioteca.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class libro {

    @SerializedName("idlibro")
    @Expose
    private int idlibro;

    @SerializedName("titulo")
    @Expose
    private String titulo;

    @SerializedName("autor")
    @Expose
    private String autor;

    @SerializedName("paginas")
    @Expose
    private int paginas;

    @SerializedName("edicion")
    @Expose
    private String edicion;

    @SerializedName("editorial_ideditorial")
    @Expose
    private int editorial_ideditorial;

    public libro(int idlibro, String titulo, String autor, int paginas, String edicion, int editorial_ideditorial) {
        this.idlibro = idlibro;
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
        this.edicion = edicion;
        this.editorial_ideditorial = editorial_ideditorial;
    }

    public int getIdp() {
        return idlibro;
    }

    public void setIdp(int id) {
        this.idlibro = idlibro;
    }

    public String gettitulo() {
        return titulo;
    }

    public void settitulop(String titulo) {
        this.titulo = titulo;
    }

    public String getautorp() {return autor;}

    public void setautorp(String autor) {this.autor = autor; }

    public int getpaginas() {
        return paginas;
    }

    public void setpaginasp(int paginas) {this.paginas = paginas; }

    public String getedicionp() {
        return edicion;
    }

    public void setedicionp(String edicion) {
        this.edicion = edicion;
    }

    public int geteditorial_ideditorialp() {
        return editorial_ideditorial;
    }

    public void seteditorial_ideditorialp(int editorial_ideditorial) {this.editorial_ideditorial = editorial_ideditorial;}

}
