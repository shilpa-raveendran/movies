package dev.shilpa.movies.service;

import java.util.List;

import dev.shilpa.movies.entity.Movie;

public interface MovieService {

	public List<Movie> getAllMovies();
	
	public void save(Movie movie);
	
	public Movie getSingleMovie(String id);
}
