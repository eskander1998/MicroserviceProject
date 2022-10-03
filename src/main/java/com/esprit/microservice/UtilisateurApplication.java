package com.esprit.microservice;

import java.util.stream.Stream;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.esprit.microservice.Entity.Utilisateur;
import com.esprit.microservice.Entity.Utilisateur;
import com.esprit.microservice.Repository.UtilisateurRepository;

@SpringBootApplication
public class UtilisateurApplication {

	public static void main(String[] args) {
		SpringApplication.run(UtilisateurApplication.class, args);
	}

	
	@Bean
	 ApplicationRunner init(UtilisateurRepository repository){
		return args ->{
			Stream.of("Eskander","Samir","hamma").forEach(nom ->{
				repository.save(new Utilisateur(nom));
			});
			repository.findAll().forEach(System.out::println);
		};
	}
}
