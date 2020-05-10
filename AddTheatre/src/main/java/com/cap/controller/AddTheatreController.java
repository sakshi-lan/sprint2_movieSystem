package com.cap.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cap.model.TheatreInfo;
import com.cap.service.AddTheatreServiceIn;

@RestController
@CrossOrigin("http://localhost:4200")
public class AddTheatreController {
	
	@Autowired
	private AddTheatreServiceIn service;
	
	@PostMapping("/add/theatre")
	public ResponseEntity<String> addTheatre(@RequestBody TheatreInfo theatre) {
		TheatreInfo m = service.addTheatre(theatre);
		if(m != null) {
			return new ResponseEntity<>("Theatre was added successfully..!!",HttpStatus.OK);
		}
		else {
			return new ResponseEntity<>("Sorry, theatre was not added..!!",HttpStatus.OK);
		}
	}
}