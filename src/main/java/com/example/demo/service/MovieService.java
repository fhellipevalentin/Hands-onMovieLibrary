package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Movie;
import com.example.demo.repository.MovieRepository;

@Service
public class MovieService {

	private final MovieRepository movieRepository;

	public MovieService(MovieRepository movieRepository) {
		this.movieRepository = movieRepository;
	}

	public List<Movie> findMoviesByName(String name) {
		return movieRepository.findByNameContaining(name);
	}

	public List<Movie> findMoviesByCollection(String collection) {
		return movieRepository.findByCollectionContaining(collection);
	}
}
