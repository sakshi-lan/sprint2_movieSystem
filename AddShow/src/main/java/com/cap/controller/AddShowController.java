package com.cap.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cap.model.ShowInfo;
import com.cap.service.AddShowServiceIn;

@RestController
@CrossOrigin("http://localhost:4200")
public class AddShowController {
	
	@Autowired
	private AddShowServiceIn service;
	
	@PostMapping("/add/show")
	public ResponseEntity<String> addShow(@RequestBody ShowInfo show) {
		System.out.println(show.toString());
		ShowInfo m = service.addShow(show);
		if(m != null) {
			return new ResponseEntity<>("Show was added successfully..!!",HttpStatus.OK);
		}
		else {
			return new ResponseEntity<>("Sorry, show was not added..!!",HttpStatus.OK);
		}
	}
}