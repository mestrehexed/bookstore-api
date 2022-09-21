package com.sergio.bookstore;


import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import com.sergio.bookstore.domain.Categoria;
import com.sergio.bookstore.domain.Livro;
import com.sergio.bookstore.repositories.CategoriaRepository;
import com.sergio.bookstore.repositories.LivroRepository;

/* Classe de Execução */


@SpringBootApplication
public class BookstoreApplication implements CommandLineRunner  {

	public static void main(String[] args) {	
	SpringApplication.run(BookstoreApplication.class, args);
		
		
		
		
	}
	
	@Autowired
	private CategoriaRepository categoriaRepository;

	@Autowired
	private LivroRepository livroRepository;

	@Override
	public void run(String... args) throws Exception {
		
		
		// instanciou o objeto categoria
				Categoria cat1 = new Categoria(null, "informática", "Livros de TI");

				// instanciou o objeto Livro e relacionou ao final a categoria "Cat1"
				Livro livro = new Livro(null, "clean code", "Robert martin", "Loren Y", "usuario1", cat1);

				// aqui o categoria instanciou um livro.
				cat1.getLivro().addAll(Arrays.asList(livro));

				

				this.categoriaRepository.saveAll(Arrays.asList(cat1));
				
				
				this.livroRepository.saveAll(Arrays.asList(livro));
		
	}

	
}
