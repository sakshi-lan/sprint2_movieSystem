package com.cap.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cap.bean.Theatre;
import com.cap.dao.DeleteTheatreDaoIn;

@Service
@Transactional
public class DeleteTheatreService implements DeleteTheatreServiceIn{
	
	@Autowired
	private DeleteTheatreDaoIn dao;

	@Override
	public List<Theatre> deleteTheatre(int id) {
		boolean bool = dao.existsById(id);
		if(bool) {
			dao.deleteById(id);
			List<Theatre> list = dao.findAll();
			return list;
		}
		else {
			return null;
		}
	}

	@Override
	public List<Theatre> getList() {
		List<Theatre> list = dao.findAll();
		return list;
	}
}