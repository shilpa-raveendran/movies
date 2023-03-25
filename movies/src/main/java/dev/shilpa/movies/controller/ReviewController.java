package dev.shilpa.movies.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import dev.shilpa.movies.service.ReviewServiceImpl;

@RestController
@RequestMapping("/api/reviews")
public class ReviewController {

	@Autowired
	private ReviewServiceImpl reviewService;

	@PostMapping("/addReviews")
	public String addEmployee(@RequestBody Map<String, String> payload) {
		reviewService.createReview(payload.get("body"), payload.get("imdbId"));
		return "added reviews";

	}
}
