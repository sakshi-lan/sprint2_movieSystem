package com.cap.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cap.bean.Theatre;
import com.cap.service.DeleteTheatreServiceIn;

@RestController
@CrossOrigin("http://localhost:4200")
public class DeleteTheatreController {
	
	@Autowired
	private DeleteTheatreServiceIn service;
	
	@DeleteMapping("/deleteTheatre/{id}")
	public List<Theatre> deleteShow(@PathVariable ("id") int id) {
		List<Theatre> list = service.deleteTheatre(id);
		return list;
	}
	
	@GetMapping("/list_of_theatres")
	public List<Theatre> getList(){
		List<Theatre> list = service.getList();
		return list;
	}
}