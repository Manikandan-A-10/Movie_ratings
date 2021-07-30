package com.movie_ratings.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Ratings_dto{

    private String id;
    private String name;
    private int user_rating;
    private int imdb_rating;
    
    public Ratings_dto()
    {
    	
    }
    
    public Ratings_dto(String id,String name, int user_rating, int imdb_rating) {
		this.id = id;
		this.name=name;
		this.user_rating = user_rating;
		this.imdb_rating = imdb_rating;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getUser_rating() {
		return user_rating;
	}
	public void setUser_rating(int user_rating) {
		this.user_rating = user_rating;
	}
	public int getImdb_rating() {
		return imdb_rating;
	}
	public void setImdb_rating(int imdb_rating) {
		this.imdb_rating = imdb_rating;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
    
}
