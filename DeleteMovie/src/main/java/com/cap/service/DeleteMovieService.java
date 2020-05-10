package com.cap.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cap.bean.Movie;
import com.cap.dao.DeleteMovieDaoIn;

@Service
@Transactional
public class DeleteMovieService implements DeleteMovieServiceIn{
	@Autowired
	private DeleteMovieDaoIn dao;

	@Override
	public List<Movie> deleteMovie(int id) {
		boolean bool = dao.existsById(id);
		if(bool) {
			dao.deleteById(id);
			List<Movie> list = dao.findAll();
			return list;
		}
		else {
			return null;
		}
	}

	@Override
	public List<Movie> listOfMovies() {
		List<Movie> list = dao.findAll();
		return list;
	}
}