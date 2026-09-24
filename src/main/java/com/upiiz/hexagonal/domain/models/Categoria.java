package com.upiiz.hexagonal.domain.models;

public class Categoria {
    private long id;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    private String descripcion;

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Categoria(String descripcion){
        this.descripcion=descripcion;
    }
    public Categoria(long id, String descripcion) {
        this.id = id;
        this.descripcion = descripcion;
    }

    public Categoria() {
    }
}
