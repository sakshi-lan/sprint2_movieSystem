package com.cap.service;

import java.util.List;

import com.cap.bean.Movie;

public interface DeleteMovieServiceIn {
	
	List<Movie> deleteMovie(int id);

	List<Movie> listOfMovies();


}