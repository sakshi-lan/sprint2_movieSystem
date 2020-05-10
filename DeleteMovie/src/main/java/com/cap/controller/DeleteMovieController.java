package com.cap.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cap.bean.Movie;
import com.cap.service.DeleteMovieServiceIn;

@RestController
@CrossOrigin("http://localhost:4200")
public class DeleteMovieController {

	@Autowired
	private DeleteMovieServiceIn service;
	
	@DeleteMapping("/deleteMovie/{id}")
	public List<Movie> deleteEmployee(@PathVariable ("id") int id) {
		List<Movie> list = service.deleteMovie(id);
		return list;
	}
	
	@GetMapping("/list_of_movies")
	public List<Movie> listOfMovies(){
		List<Movie> list = service.listOfMovies();
		return list;
	}
}