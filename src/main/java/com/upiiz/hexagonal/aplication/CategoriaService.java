package com.upiiz.hexagonal.aplication;

import com.upiiz.hexagonal.domain.models.Categoria;
import com.upiiz.hexagonal.domain.ports.in.CategoriaUseCase;
import com.upiiz.hexagonal.domain.ports.out.CategoriasRepository;

import java.util.List;

public class CategoriaService implements CategoriaUseCase {
    //Reglas de negocio
    private CategoriasRepository categoriasRepository;

    public CategoriaService(CategoriasRepository categoriasRepository){
        this.categoriasRepository = categoriasRepository;
    }

    @Override
    public Categoria registrar(Categoria categoria) {
        //validar que los datos esten correctos
        return categoriasRepository.save(categoria);
    }

    @Override
    public List<Categoria> listar() {
        return categoriasRepository.findAll();
    }

    @Override
    public Categoria buscarPorId(Long id) {
        return categoriasRepository.findById(id);
    }

    @Override
    public void eliminar(Long id) {
        categoriasRepository.delete(id);
    }

    @Override
    public Categoria actualizar(Categoria categoria) {
        return categoriasRepository.update(categoria);
    }
}
