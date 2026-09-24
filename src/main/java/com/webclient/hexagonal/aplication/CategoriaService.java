package com.webclient.hexagonal.aplication;

import com.webclient.hexagonal.domain.models.Categoria;
import com.webclient.hexagonal.port.in.CategoriaUserCase;
import com.webclient.hexagonal.port.out.CategoriaRepository;

import java.util.List;

public class CategoriaService implements CategoriaUserCase {
    // Reglas del negocio
    private CategoriaRepository categoriaRepository;

    public CategoriaService() {
    }

    public CategoriaService(CategoriaRepository categoriaRepository) {

        this.categoriaRepository = categoriaRepository;
    }

    @Override
    public Categoria registrar(Categoria categoria) {
        return categoriaRepository.save(categoria);
    }

    @Override
    public List<Categoria> listar() {
        return categoriaRepository.findAll();
    }

    @Override
    public Categoria buscarPorId(Long id) {
        return null;
    }

    @Override
    public Categoria actualizar(Categoria categoria) {
        return categoriaRepository.save(categoria);
    }

    @Override
    public void eliminar(Long id) {
        categoriaRepository.delete(id);
    }
}
