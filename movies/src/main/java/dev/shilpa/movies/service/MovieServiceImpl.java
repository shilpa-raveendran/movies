package dev.shilpa.movies.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.shilpa.movies.dao.MovieRepository;
import dev.shilpa.movies.entity.Movie;



@Service
public class MovieServiceImpl implements MovieService {

	@Autowired
	private MovieRepository movieRepo;
	
	@Override
	public List<Movie> getAllMovies() {
		return movieRepo.findAll();
	}
	
	@Override
	public void save(Movie movie) {
		movieRepo.save(movie);
	}
	
	@Override
	public Movie getSingleMovie(String imdbId) {
		Optional<Movie> movie=movieRepo.findMovieByImdbId(imdbId);
		Movie theMovie = null;

		if (movie.isPresent()) {
			theMovie = movie.get();
		} else {
			throw new RuntimeException("Did not find movie imdbId - " + imdbId);
		}
		
		return theMovie;
	}
}
