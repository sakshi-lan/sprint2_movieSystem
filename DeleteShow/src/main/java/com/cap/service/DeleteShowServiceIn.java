package com.cap.service;

import java.util.List;

import com.cap.bean.Show;
import com.cap.exception.InvalidShowId;

public interface DeleteShowServiceIn {
	
	List<Show> deleteShow(int id) throws InvalidShowId;

	List<Show> getAllShows();


}