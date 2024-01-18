package com.example.demo.configuration;

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
			newMovie.setMovieName("The Mummy");
			newMovie.setMovieCollection("3000000");
			movieRepository.save(newMovie);
		}
	}
	
	
}
