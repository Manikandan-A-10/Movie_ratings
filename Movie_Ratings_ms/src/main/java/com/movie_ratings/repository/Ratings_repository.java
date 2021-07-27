package com.movie_ratings.repository;

import com.movie_ratings.entity.Ratings;


import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Ratings_repository extends ReactiveMongoRepository<Ratings,String> {
   
}
