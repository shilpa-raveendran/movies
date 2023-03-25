package dev.shilpa.movies.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.shilpa.movies.entity.Movie;
import dev.shilpa.movies.service.MovieServiceImpl;

@RestController
@RequestMapping("/api/movies")
public class MovieController {

	@Autowired
	private MovieServiceImpl movieService;

	@GetMapping("/allMovies")
	public ResponseEntity<List<Movie>> getAllMovies() {
		return new ResponseEntity<List<Movie>>(movieService.getAllMovies(),HttpStatus.OK);
	}

	@PostMapping("/addMovies")
	public String addEmployee(@RequestBody  Movie toSave) {

		movieService.save(toSave);
		return "Added movies";
	}

	@GetMapping("/{imdbId}")
	public Movie getSingleMovie(@PathVariable String imdbId) {
		return (movieService.getSingleMovie(imdbId));
	}
}
