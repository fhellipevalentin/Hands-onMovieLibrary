package com.example.demo.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Movie;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long>{
	
	Optional<Movie> findByMovieId(String movieId);
	
	List<Movie> findByNameContaining(String name);
	List<Movie> findByCollectionContaining(String collection);
}
