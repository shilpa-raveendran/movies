package dev.shilpa.movies.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.shilpa.movies.entity.Review;


public interface ReviewRepository extends JpaRepository<Review, Integer>{

}
