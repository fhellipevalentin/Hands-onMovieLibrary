package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.model.Movie;
import com.example.demo.repository.MovieRepository;

@Controller
@RequestMapping("/movie")
public class MovieController {
	
	@Autowired
	private MovieRepository movieRepository;
	
	@GetMapping("/id/{movieId}")
	public String getMovieById (@PathVariable String movieId, Model model) {
		Movie movie = movieRepository.findByMovieId(movieId);
		model.addAttribute("movie", movie);
		return "getMovieById";
	}
	
	@GetMapping("/name/{movieName}")
	public String getMovieByName (@PathVariable String movieName, Model model) {
		Movie movie = movieRepository.findByMovieName(movieName);
		model.addAttribute("movie", movie);
		return "getMovieByName";
	}
	
	@GetMapping("/collection/{movieCollection}")
	public String getMovieByCollection (@PathVariable String movieCollection, Model model) {
		Movie movie = movieRepository.findByMovieCollection(movieCollection);
		model.addAttribute("movie", movie);
		return "getMovieByCollection";
	}
	
}
