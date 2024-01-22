package com.example.demo.configuration;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.demo.model.Movie;
import com.example.demo.repository.MovieRepository;

@Component
public class DataInitializer implements CommandLineRunner{
	
	@Autowired
	public MovieRepository movieRepository;
	
	@Override
	public void run(String... args) throws Exception {
		if (movieRepository.count() == 0) {
			Movie newMovie = new Movie();
			newMovie.setMovieId("M001");
			newMovie.setName("The Mummy");
			newMovie.setCollection("3000000");
			Movie newMovie9 = new Movie();
			newMovie9.setMovieId("M009");
			newMovie9.setName("The Mummy Returns");
			newMovie9.setCollection("9000000");
			movieRepository.saveAll(Arrays.asList(newMovie, newMovie9));
		}	
	
	}
	
}
