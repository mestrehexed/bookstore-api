package com.sergio.bookstore.domain;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Categoria implements Serializable {

	/** Classe De declaração de Atributos e métodos 
	 
	 */
	private static final long serialVersionUID = 1L;

	// variáveis

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nome;
	private String descricao;

	@OneToMany(mappedBy = "categoria")
	private List<Livro> livro = new ArrayList<>();

	// contrutor da super classe
	public Categoria() {
		super();
		// TODO Auto-generated constructor stub
	}

	// contrutor da super classe
	public Categoria(Integer id, String descricao, String nome) {
		super();
		this.id = id;
		this.nome = nome;
		this.descricao = descricao;

	}

	// gets e setters
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Livro> getLivro() {
		return livro;
	}

	public void setLivro(List<Livro> livro) {
		this.livro = livro;
	}

	// hash code apenas pelo id
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Categoria other = (Categoria) obj;
		return Objects.equals(id, other.id);
	}

}
