package com.webclient.hexagonal.port.out;


import com.webclient.hexagonal.domain.models.Categoria;

import java.util.List;

public interface CategoriaRepository {
    Categoria save(Categoria categoria);
    Categoria findById(Long Id);
    List<Categoria> findAll();
    Categoria update(Categoria categoria);
    void delete(Long id);


}
