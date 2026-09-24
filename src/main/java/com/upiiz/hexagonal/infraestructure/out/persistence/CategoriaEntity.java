package com.upiiz.hexagonal.infraestructure.out.persistence;

import jakarta.persistence.*;

//Mapear a la DB
@Entity
@Table(name = "categoria")
public class CategoriaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String descripcion;

    public CategoriaEntity(Long id, String descripcion) {
        this.id = id;
        this.descripcion = descripcion;
    }

    public CategoriaEntity() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

}
