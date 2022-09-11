package com.sergio.bookstore.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.sergio.bookstore.service.DBservice;

@Configuration
@Profile("dev")
public class DevConfig {

	@Autowired
	private DBservice dbservice;
	
	@Value("$(spring.jpa.hibernate.ddl-auto)")
	private String strategy;
	@Bean
	public boolean intanciaBaseDeDados() {
		
		if(strategy.equals("create")) {
			
			this.dbservice.instanciabasededados();
			
		}
		return false;
	}
	
	
	
		
}
