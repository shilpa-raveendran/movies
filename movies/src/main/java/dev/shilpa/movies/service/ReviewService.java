package dev.shilpa.movies.service;

import dev.shilpa.movies.entity.Review;

public interface ReviewService {

	public Review createReview(String reviewBody, String imdbId);
}
