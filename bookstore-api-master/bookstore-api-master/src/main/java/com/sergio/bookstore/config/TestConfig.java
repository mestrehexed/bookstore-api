package com.sergio.bookstore.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.sergio.bookstore.service.DBService;



//é uma configuração de perfis para escolher qual banco vai ser utilizado.


@Configuration
@Profile("test")
public class TestConfig {
	
	@Autowired
	private DBService dbservice;
	
	
	@Bean
	public void instanciabasededadosconfigtest() {
		this.dbservice.instanciaBaseDeDados();
		
		
	}
	
	
	

}
