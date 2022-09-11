package com.sergio.bookstore;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;




@EntityScan(basePackages = "com.sergio.bookstore.domain")
@SpringBootApplication
public class BookstoreApplication  {

	public static void main(String[] args) {	
	SpringApplication.run(BookstoreApplication.class, args);
		
		
		
		
	}

	
}
