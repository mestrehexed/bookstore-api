package com.sergio.bookstore.domain;

public class Usuario {
	
	
	// variaveis 
	private Integer id;
	private String login;
	private String nome;
	
	
	
	// gets e sets
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	private String senha;
	
	

}
