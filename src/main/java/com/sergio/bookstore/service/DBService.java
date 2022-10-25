package com.sergio.bookstore.service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sergio.bookstore.domain.Categoria;
import com.sergio.bookstore.domain.Livro;
import com.sergio.bookstore.repositories.CategoriaRepository;
import com.sergio.bookstore.repositories.LivroRepository;

@Service
public class DBService {

	@Autowired
	private CategoriaRepository categoriaRepository;

	@Autowired
	private LivroRepository livroRepository;

	public void instanciaBaseDeDados() {

		// instanciou o objeto categoria
		Categoria cat1 = new Categoria(null, "informática", "Livros de TI");
		Categoria cat2 = new Categoria(null, "infor2", "Livros 2");
		Categoria cat3= new Categoria(null, "infor3", "Livros 3");
		Categoria cat4 = new Categoria(null, "infor4", "Livros 4");
		
		this.categoriaRepository.saveAll(Arrays.asList(cat1));
		this.categoriaRepository.saveAll(Arrays.asList(cat2));
		this.categoriaRepository.saveAll(Arrays.asList(cat3));
		this.categoriaRepository.saveAll(Arrays.asList(cat4));
		
		
		
		
		// instanciou o objeto Livro e relacionou ao final a categoria "Cat1"
		Livro livro = new Livro(null, "clean code", "Robert martin", "Loren Y", "usuario1", cat1);
		Livro livro2 = new Livro(null, "clean 2", "Robert 2", "Loren 2", "usuario2", cat2);
		Livro livro3 = new Livro(null, "clean 3", "Robert 3", "Loren 3", "usuario3", cat3);
		Livro livro4 = new Livro(null, "clean 4", "Robert 4", "Loren 4", "usuario4", cat4);
		

		// aqui o categoria instanciou um livro.
		cat1.getLivro().addAll(Arrays.asList(livro));
		cat2.getLivro().addAll(Arrays.asList(livro));
		cat3.getLivro().addAll(Arrays.asList(livro));
		cat4.getLivro().addAll(Arrays.asList(livro));

		

		this.livroRepository.saveAll(Arrays.asList(livro));
		this.livroRepository.saveAll(Arrays.asList(livro2));
		this.livroRepository.saveAll(Arrays.asList(livro3));
		this.livroRepository.saveAll(Arrays.asList(livro4));

	}
}
