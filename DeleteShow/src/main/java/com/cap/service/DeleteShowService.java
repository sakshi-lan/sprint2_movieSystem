package com.cap.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cap.bean.Show;
import com.cap.dao.DeleteShowDaoIn;
import com.cap.exception.InvalidShowId;

@Service
@Transactional
public class DeleteShowService implements DeleteShowServiceIn{
	@Autowired
	private DeleteShowDaoIn dao;

	@Override
	public List<Show> deleteShow(int id) throws InvalidShowId {
		boolean bool = dao.existsById(id);
		if(bool) {
			dao.deleteById(id);
			List<Show> list = dao.findAll();
			return list;
		}
		else {
			throw new InvalidShowId("sorry, the show Id is incorrect..!!");
		}
	}
	
	@Override
	public List<Show> getAllShows() {
		List<Show> list = dao.findAll();
		return list;
	}
}