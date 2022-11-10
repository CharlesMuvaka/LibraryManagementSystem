package com.example.sgrDatabase;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

@SpringBootApplication
public class SgrDatabaseApplication {

	public static void main(String[] args) {
		SpringApplication.run(SgrDatabaseApplication.class, args);
		String newLine = "\n";
		String databaseUrl = "spring.datasource.url = jdbc:postgresql://localhost:5432/sgr_database";
		File applicationProperties = new File("src/resources/application.properties");
		try{
			if(applicationProperties.exists()){
				FileWriter writer = new FileWriter(applicationProperties);
				writer.write();


			}
		}catch(IOException e){
			System.out.println(e.getMessage());
		}
	}

}
