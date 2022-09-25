package com.gl.business.dao;

import java.util.List;

import com.gl.business.model.Bussiness;

public interface BussinessDao {

	public void save(Bussiness bussiness);
	public List<Bussiness>findAll();

}
