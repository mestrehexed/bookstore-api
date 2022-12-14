package com.sergio.bookstore.domain;

import java.io.Serializable;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Length;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * Classe De declaração de Atributos e métodos
 * 
 */

@Entity
public class Livro implements Serializable {

	private static final long serialVersionUID = 1L;

	// variaveis
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@NotEmpty(message = " titulo é requerido")
	@Length(min = 3, max = 50, message = " Titulo é no minimo de 3 até 50 caracteres")
	private String titulo;

	@NotEmpty(message = "Nome autor é requerido")
	@Length(min = 3, max = 50, message = "Nome Autor é no minimo de  3 até 50 caracteres")
	private String nome_autor;

	@NotEmpty(message = "Nome texto é requerido")
	@Length(min = 8,max = 2000000,message = "texto tem o minimo 8  caracteres até o infinito.")
	private String texto;

	@JsonIgnore // utilizado para n ficar repetindo dados da tabela.
	@ManyToOne
	@JoinColumn(name = "categoria_id")
	private Categoria categoria;

	// contrutor da super classe
	public Livro() {
		super();
		// TODO Auto-generated constructor stub
	}

	// contrutor da super classe
	public Livro(Integer id, String titulo, String nome_autor, String descricao, String texto, Categoria categoria) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.nome_autor = nome_autor;
		this.texto = texto;
		this.categoria = categoria;
	}

	// gets e setters

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getNome_autor() {
		return nome_autor;
	}

	public void setNome_autor(String nome_autor) {
		this.nome_autor = nome_autor;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
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
		Livro other = (Livro) obj;
		return Objects.equals(id, other.id);
	}

}
