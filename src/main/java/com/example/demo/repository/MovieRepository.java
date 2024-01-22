package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Movie;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long>{
	
	Movie findByMovieId(String movieId);
	
	List<Movie> findByNameContaining(String name);
	List<Movie> findByCollectionContaining(String collection);
}
