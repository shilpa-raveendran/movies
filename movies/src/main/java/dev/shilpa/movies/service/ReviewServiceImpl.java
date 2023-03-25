package dev.shilpa.movies.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.shilpa.movies.dao.ReviewRepository;
import dev.shilpa.movies.entity.Review;

@Service
public class ReviewServiceImpl implements ReviewService {
	
	@Autowired
	private ReviewRepository reviewRepo;
	
	@Autowired
	private MovieServiceImpl movieService;
	
	public Review createReview(String reviewBody, String imdbId) {
		Review review = new Review(reviewBody);
		review.setMovie(movieService.getSingleMovie(imdbId));
		reviewRepo.save(review);
		return review;
	}

}
