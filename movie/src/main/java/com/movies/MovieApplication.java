package com.movies;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
@ComponentScan("com.movies.movie.repository")
@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class MovieApplication {

	public static void main(String[] args) {
		System.out.println("App is started.");
		SpringApplication.run(MovieApplication.class, args);
	}

}
