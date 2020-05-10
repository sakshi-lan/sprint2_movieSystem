package com.cap.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cap.bean.Movie;
import com.cap.dao.AddMovieDaoIn;


@Service
@Transactional
public class AddMovieService implements AddMovieServiceIn {

	@Autowired
  private AddMovieDaoIn dao;

	@Override
	public Movie addMovie(Movie mov) {
		return dao.save(mov);
	}
}