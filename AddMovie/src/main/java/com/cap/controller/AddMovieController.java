package com.cap.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cap.bean.Movie;
import com.cap.service.AddMovieServiceIn;

@RestController
@CrossOrigin("http://localhost:4200")
public class AddMovieController {
	
	@Autowired
	private AddMovieServiceIn service;
	
	@PostMapping("/add/movie")
	public ResponseEntity<String> addMovie(@RequestBody Movie mov) {
		Movie m = service.addMovie(mov);
		if(m != null) {
			return new ResponseEntity<>("Movie was added Successfully..!!",HttpStatus.OK);
		}
		else {
			return new ResponseEntity<>("Sorry, Movie was not added..!!",HttpStatus.OK);
		}
	}
}
