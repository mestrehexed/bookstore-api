package com.sergio.bookstore.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;
import com.sergio.bookstore.domain.Categoria;

/**
 * Classe De configuração Repositórios
 * 
 */

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {

}
