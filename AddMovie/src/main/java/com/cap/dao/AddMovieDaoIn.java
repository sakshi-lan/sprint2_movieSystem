package com.cap.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cap.bean.Movie;

public interface AddMovieDaoIn  extends JpaRepository<Movie, Integer>{

}