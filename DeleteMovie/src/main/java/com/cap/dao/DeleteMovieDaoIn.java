package com.cap.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cap.bean.Movie;

	
public interface DeleteMovieDaoIn extends JpaRepository<Movie, Integer>{

}