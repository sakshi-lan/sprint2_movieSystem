package com.cap.service;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cap.bean.Movie;
import com.cap.bean.Theatre;
import com.cap.dao.AddTheatreDaoIn;
import com.cap.dao.MovieDao;
import com.cap.model.TheatreInfo;

@Service
@Transactional
public class AddTheatreService implements AddTheatreServiceIn {

	@Autowired
	private AddTheatreDaoIn dao;

	@Autowired
	private MovieDao movieDao;

	@Override
	public TheatreInfo addTheatre(TheatreInfo theatreInfo) {

		boolean bool = movieDao.existsById(theatreInfo.getMovie_Id());
		if(bool) {
			Theatre theatre = new Theatre();
			Optional<Movie> movie = movieDao.findById(theatreInfo.getMovie_Id());
			theatre.setMovie(movie.get());
			theatre.setTheatre_Name(theatreInfo.getTheatre_Name());
			theatre.setTheatre_City( theatreInfo.getTheatre_City());
			theatre.setManager_Name( theatreInfo.getManager_Name());
			theatre.setManager_Contact(theatreInfo.getManager_Contact());
			theatre.setR_movie_id(theatreInfo.getR_movie_id());
			
			theatre = dao.save(theatre);

			return theatreInfo;
		}
		else {
			return null;
		}
	}
}