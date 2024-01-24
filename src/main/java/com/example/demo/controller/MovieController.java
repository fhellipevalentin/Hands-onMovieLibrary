package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.controller.exception.MovieNotFoundException;
import com.example.demo.model.Movie;
import com.example.demo.service.MovieService;

@Controller
public class MovieController {

	@Autowired
	private MovieService movieService;

	@GetMapping("/movies/id/{movieId}")
	public String getMovieById(@PathVariable String movieId, Model model) {
		Movie movie = movieService.findMoviesById(movieId);
		model.addAttribute("movie", movie);
		return "getMovieById";
	}

	@GetMapping("/movies/search")
	public String searchMovies(@RequestParam String name, Model model) {
		List<Movie> movies = movieService.findMoviesByName(name);
		model.addAttribute("movies", movies);
		return "getMovieByName";
	}
	@GetMapping("/movies/collection")
	public String searchCollection(@RequestParam String collection, Model model) {
		List<Movie> movies = movieService.findMoviesByCollection(collection);
		model.addAttribute("movies", movies);
		return "getMovieByCollection";
	}
	
	@ExceptionHandler(MovieNotFoundException.class)
	public String handleException(MovieNotFoundException ex, Model model) {
	    model.addAttribute("message", ex.getMessage());
	    return "error";
	}
	
	@GetMapping("/movies/admin")
	public String admin() {
		return "admin";
	}
	
	@GetMapping("/movies/newMovie")
	public String newMovie() {
		return "newMovie";
	}
	
	@GetMapping("/movies/advice")
	public String advice() {
		return "advice";
	}
}
