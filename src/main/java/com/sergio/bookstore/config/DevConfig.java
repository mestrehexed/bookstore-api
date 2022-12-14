package com.sergio.bookstore.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.sergio.bookstore.service.DBService;


// é uma configuração de perfis para escolher qual banco de dados vai ser utilizado.


@Configuration
@Profile("dev")
public class DevConfig {
	
	//acessar um objeto de outra classe
	@Autowired
	private DBService dbservice;
	
	
	@Value("${spring.jpa.hibernate.ddl-auto}")
	private String strategy;

	@Bean
	public boolean instanciabasededadosconfigdev() {

		if (strategy.equals("create")) {

			this.dbservice.instanciaBaseDeDados();
		}
		return false;
	}

}
