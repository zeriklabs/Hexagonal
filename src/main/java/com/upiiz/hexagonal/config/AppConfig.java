package com.upiiz.hexagonal.config;

import com.upiiz.hexagonal.aplication.CategoriaService;
import com.upiiz.hexagonal.domain.ports.in.CategoriaUseCase;
import com.upiiz.hexagonal.domain.ports.out.CategoriasRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    // Beans que se van a comer
    // Instancias que la app va a usar

    // Adaptador de salida - DB
    // @Bean
    // public CategoriasRepository categoriasRepository(){
    // return null;
    // }
    // Puerto de entrada - REST
    @Bean
    public CategoriaUseCase categoriaUseCase(CategoriasRepository categoriasRepository) {
        return new CategoriaService(categoriasRepository);
    }

}
