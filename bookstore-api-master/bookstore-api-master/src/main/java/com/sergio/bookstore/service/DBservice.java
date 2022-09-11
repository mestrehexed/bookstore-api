package com.sergio.bookstore.service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sergio.bookstore.domain.Categoria;
import com.sergio.bookstore.domain.Livro;
import com.sergio.bookstore.repositories.CategoriaRepository;
import com.sergio.bookstore.repositories.LivroRepository;

@Service
public class DBservice {
	
	
	@Autowired
	private CategoriaRepository categoriarepository;
	
	@Autowired
	private LivroRepository livrorepository;
	
	
	
	public void instanciabasededados() {
		
		
		//instanciou o objeto categoria
				Categoria cat1 = new Categoria(null, "informática", "Livros de TI");
				
				//instanciou o objeto Livro e relacionou ao final a categoria "Cat1"
				Livro livro = new Livro(null, "clean code",  "Robert martin",  "Loren Y","usuario1",cat1);
				
				// aqui o categoria instanciou um livro.
				cat1.getLivro().addAll(Arrays.asList(livro));
				
				this.categoriarepository.saveAll(Arrays.asList(cat1));
				
				this.livrorepository.saveAll(Arrays.asList(livro)); 
					
		
		
	}
	
	
	
	
	

}
