package com.example.demo.repos;

import com.example.demo.models.GameReview;
import org.springframework.data.repository.CrudRepository;

public interface GameReviewRepository extends CrudRepository<GameReview,Long> {
}
