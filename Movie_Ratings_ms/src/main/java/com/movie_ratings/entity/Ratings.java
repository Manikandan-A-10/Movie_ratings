package com.movie_ratings.entity;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "ratings")
public class Ratings 
{
    @Id
   
    private String id;
    
    @NotNull
    @Size(min=3,message="The Movie ID should be more than 3 Characters")
    private String name;
    
    @NotEmpty
    @Max(5)
    @Min(0)
    private int user_rating;
    
    @NotEmpty
    @Max(10)
    @Min(0)
    private int imdb_rating;
	
    public Ratings()
    {
    	
    }
    public Ratings(String id,String name, int user_rating, int imdb_rating) {
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
