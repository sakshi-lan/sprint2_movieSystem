package com.cap;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.springframework.beans.factory.annotation.Autowired;

import com.cap.bean.Movie;
import com.cap.service.AddMovieServiceIn;

public class AddMovieApplicationTests {
	
	@Autowired
	private AddMovieServiceIn service;
	
	@Test
	public void addMovie(){
		Movie m = new Movie();
		m.setMovie_Id(106);
		m.setLanguages("Hindi");
		m.setMovie_Director("Rohit Shetty");
		m.setMovie_Genre("Action");
		m.setMovie_Length("3hrs");
		m.setMovie_Name("Singham");
		m.setMovie_Release_Date("2020-06-21");
		Movie m1 = service.addMovie(m);
		System.out.println(m1.toString());
		Assertions.assertEquals(m.toString(), m1.toString());
	}
}