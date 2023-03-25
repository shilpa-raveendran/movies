package dev.shilpa.movies.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dev.shilpa.movies.entity.Movie;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Integer> {
	
	public Optional<Movie> findMovieByImdbId(String imdbId) ;

}
