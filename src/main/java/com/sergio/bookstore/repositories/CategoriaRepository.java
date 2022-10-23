package com.sergio.bookstore.repositories;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.sergio.bookstore.domain.Categoria;

/**
 * Classe De configuração Repositórios 
 * 
 */

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {

	@Query(value = "SELECT * FROM `categoria` ORDER BY `categoria`.`nome` ASC", nativeQuery=true)
	public List<Categoria> pesquisar(String palavra);
	
	
	
	
}
