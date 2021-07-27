package com.movie_ratings.utils;

import com.movie_ratings.dto.Ratings_dto;
import com.movie_ratings.entity.Ratings;

import org.springframework.beans.BeanUtils;

public class AppUtils {


	public static Ratings_dto entityToDto(Ratings r) 
	 {
	       Ratings_dto rd=new Ratings_dto();
	        BeanUtils.copyProperties(r, rd);
	        return rd;
	    }

	 public static Ratings dtoToEntity(Ratings_dto rd) 
	 {
	       Ratings r=new Ratings();
	        BeanUtils.copyProperties(rd, r);
	        return r;
	    }
}
