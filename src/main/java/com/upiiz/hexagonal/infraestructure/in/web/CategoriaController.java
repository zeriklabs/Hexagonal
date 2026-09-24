package com.upiiz.hexagonal.infraestructure.in.web;

import com.upiiz.hexagonal.aplication.CategoriaService;
import com.upiiz.hexagonal.domain.models.Categoria;
import com.upiiz.hexagonal.domain.ports.in.CategoriaUseCase;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/categorias") //dónde ponemos las solicitudes
public class CategoriaController {
    //Utilizamos los casos de uso - Service
    //Implementados en Categorias Service - aplication
    private final CategoriaUseCase categoriaService;
    public CategoriaController(final CategoriaUseCase categoriaService) {
        this.categoriaService = categoriaService;
    }

    //Get a todas
    @GetMapping
    public List<Categoria> getCategoria(){
        return categoriaService.listar();
    }
    //Get una
    @GetMapping("/{id}")
    public Categoria getCategoriaById(@PathVariable Long id){
        return categoriaService.buscarPorId(id);
    }
    //Crear categoria POST
    @PostMapping
    public Categoria createCategoria(@RequestBody final Categoria categoria){
        return categoriaService.registrar(categoria);
    }
    //Guardar categoria POST
    @PostMapping("/{id}")
    public Categoria updateCategoria(@RequestBody final Categoria categoria){
        return categoriaService.actualizar(categoria);
    }
    @DeleteMapping("/{id}")
    public void deleteCategoria(@PathVariable final Long id){
        categoriaService.eliminar(id);
    }
}
