package com.upiiz.hexagonal.domain.ports.in;

import com.upiiz.hexagonal.domain.models.Categoria;

import java.util.List;

//interfaz - contratos - puerto de entrada
public interface CategoriaUseCase{
    Categoria registrar(Categoria categoria);
    List<Categoria> listar();
    Categoria buscarPorId(Long id);
    void eliminar(Long id);
    Categoria actualizar(Categoria categoria);
}