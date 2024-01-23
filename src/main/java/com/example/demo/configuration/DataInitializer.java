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
			Movie newMovie2 = new Movie();
			newMovie2.setMovieId("M002");
			newMovie2.setName("The Firm");
			newMovie2.setCollection("2000000");
			Movie newMovie3 = new Movie();
			newMovie3.setMovieId("M003");
			newMovie3.setName("Mr. Bean");
			newMovie3.setCollection("2500000");
			Movie newMovie4 = new Movie();
			newMovie4.setMovieId("M004");
			newMovie4.setName("Logan");
			newMovie4.setCollection("2500000");
			Movie newMovie5 = new Movie();
			newMovie5.setMovieId("M005");
			newMovie5.setName("The Avengers: Age of Ultron");
			newMovie5.setCollection("6000000");
			Movie newMovie6 = new Movie();
			newMovie6.setMovieId("M006");
			newMovie6.setName("Top Gun");
			newMovie6.setCollection("2000000");
			Movie newMovie7 = new Movie();
			newMovie7.setMovieId("M007");
			newMovie7.setName("Moana");
			newMovie7.setCollection("4000000");
			Movie newMovie8 = new Movie();
			newMovie8.setMovieId("M008");
			newMovie8.setName("Finding Nemo");
			newMovie8.setCollection("5500000");
			Movie newMovie9 = new Movie();
			newMovie9.setMovieId("M009");
			newMovie9.setName("The Mummy Returns");
			newMovie9.setCollection("9000000");
			Movie newMovie10 = new Movie();
			newMovie10.setMovieId("M010");
			newMovie10.setName("Star Wars");
			newMovie10.setCollection("7000000");
			movieRepository.saveAll(Arrays.asList(newMovie, newMovie2, newMovie3, newMovie4,
					newMovie5, newMovie6, newMovie7, newMovie8, newMovie9, newMovie10));
		}	
	
	}
	
}
