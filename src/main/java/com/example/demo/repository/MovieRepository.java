package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Movie;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long>{
	
	Movie findByMovieId(String movieId);
	Movie findByMovieName(String movieName);
	Movie findByMovieCollection(String movieCollection);
}
