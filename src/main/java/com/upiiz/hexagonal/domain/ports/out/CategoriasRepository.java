package com.upiiz.hexagonal.domain.ports.out;

import com.upiiz.hexagonal.domain.models.Categoria;

import java.util.List;

//interfaz - contrato - Puerto salida
public interface CategoriasRepository {
    Categoria save(Categoria categoria);
    Categoria findById(Long id);
    List<Categoria> findAll();
    void delete(Long id);
    Categoria update(Categoria categoria);
}
