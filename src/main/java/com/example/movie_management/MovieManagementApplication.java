package com.example.movie_management;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication              // Indique une application Spring Boot
@EnableCaching                     // Active le support du cache (Redis, EhCache, etc.)
public class MovieManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieManagementApplication.class, args); // Démarre l'application
	}
}
