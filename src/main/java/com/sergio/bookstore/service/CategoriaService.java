package com.sergio.bookstore.service;

import java.net.URI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.reactive.WebFluxProperties.Session;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import com.sergio.bookstore.domain.Categoria;
import com.sergio.bookstore.dtos.CategoriaDTO;
import com.sergio.bookstore.repositories.CategoriaRepository;
import com.sergio.bookstore.service.exceptions.ObjectNotFoundException;

// @service é utilizado para salvar,atualizar,excluir ou adicionar um objeto, resumindo Manipulação do banco de dados.

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository repository;

	public Categoria findById(Integer id) {

		Optional<Categoria> obj = repository.findById(id);

		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado!" + "  " + "id:" + id + ", Tipo:" + "" + Categoria.class.getName()));

	}

	public List<Categoria> findAll() {
		return repository.findAll();
	}

	// testando metodos

	public Categoria create(Categoria obj) {
	

		obj.setId(null);
		return repository.save(obj);
		
	}

	public Categoria update(Integer id, CategoriaDTO objDto) {
		Categoria obj = findById(id);
		obj.setNome(objDto.getNome());
		obj.setDescricao(objDto.getDescricao());
		return repository.save(obj);
	}

	public void delete(Integer id) {

		findById(id);

		try {
			repository.deleteById(id);
		} catch (DataIntegrityViolationException e) {
			throw new com.sergio.bookstore.service.exceptions.DataIntegrityViolationException(
					"Categoria não pode ser deletado! Possui livros associados.");
		}

	}

}