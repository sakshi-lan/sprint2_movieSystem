package com.cap.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cap.bean.Show;
import com.cap.exception.InvalidShowId;
import com.cap.service.DeleteShowServiceIn;

@RestController
@CrossOrigin("http://localhost:4200")
public class DeleteShowController {

	@Autowired
	private DeleteShowServiceIn service;
	
	@DeleteMapping("/deleteShow/{id}")
	public List<Show> deleteShow(@PathVariable ("id") int id) throws InvalidShowId {
		List<Show> list = service.deleteShow(id);
		return list;
	}
	
	@GetMapping("/list_of_shows")
	public List<Show> getAllShows(){
		List<Show> list = service.getAllShows();
		return list;
	}
}