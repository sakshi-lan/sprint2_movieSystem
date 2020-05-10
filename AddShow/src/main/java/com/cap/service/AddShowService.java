package com.cap.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cap.dao.AddShowDaoIn;
import com.cap.dao.MovieDao;
import com.cap.bean.Movie;
import com.cap.bean.Show;
import com.cap.model.ShowInfo;

@Service
@Transactional
public class AddShowService implements AddShowServiceIn {

	@Autowired
  private AddShowDaoIn dao;
	
	@Autowired
	  private MovieDao movieDao;
	

	@Override
	public ShowInfo addShow(ShowInfo showInfo) {
		
		Boolean bool = movieDao.existsById(showInfo.getMovie_Id());
		if(bool) {
		Optional<Movie> m = movieDao.findById(showInfo.getMovie_Id());
		Show show = new Show();
		show.setMovie(m.get());
		show.setScreen_Id(showInfo.getScreen_Id());
		show.setShow_End_Time(showInfo.getShow_End_Time());
		show.setShow_Start_Time(showInfo.getShow_Start_Time());
		show.setShow_Name(showInfo.getShow_Name());
		show.setR_movie_id(showInfo.getR_movie_id());
		
		show = dao.save(show);
		
		return showInfo;
		}
		else {
			return null;
		}
	}
}