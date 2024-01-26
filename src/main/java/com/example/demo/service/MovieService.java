package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.controller.exception.MovieNotFoundException;
import com.example.demo.model.Movie;
import com.example.demo.repository.MovieRepository;

@Service
public class MovieService {

	private final MovieRepository movieRepository;

	public MovieService(MovieRepository movieRepository) {
		this.movieRepository = movieRepository;
	}

	public List<Movie> findMoviesByName(String name) {
		List<Movie> movies = movieRepository.findByNameContaining(name);
		if (movies.isEmpty()) {
		    throw new MovieNotFoundException("Sorry no matchers found for the search criteria");
		}
		return movies;
	}
	
	public Movie findMoviesById(String movieId) {
        return movieRepository.findByMovieId(movieId)
            .orElseThrow(() -> new MovieNotFoundException("Sorry no matchers found for the search criteria"));
	}

	public List<Movie> findMoviesByCollection(String collection) {
		List<Movie> collections = movieRepository.findByCollectionContaining(collection);
		if (collections.isEmpty()) {
			throw new MovieNotFoundException("Sorry no matchers found for the search criteria");
		}
		return collections;
	}
	
	public Movie addMovie(Movie movie) {
		return movieRepository.save(movie);
	}
}
