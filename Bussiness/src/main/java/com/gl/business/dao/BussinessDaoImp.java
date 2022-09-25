package com.gl.business.dao;

import java.util.List;

import javax.transaction.Transactional;
import javax.persistence.criteria.CriteriaQuery;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gl.business.model.Bussiness;

@Repository
public class BussinessDaoImp implements BussinessDao {
	@Autowired
	SessionFactory factory;

	@Override
	@Transactional
	public void save(Bussiness bussiness) {
		
		Session currentSession = factory.getCurrentSession();
		currentSession.saveOrUpdate(bussiness);
	}

	@Override
	@Transactional
	public List<Bussiness> findAll() {
//		System.out.println("Ho");
	    Session currentSession = factory.getCurrentSession();
	    Criteria c = currentSession.createCriteria(Bussiness.class);
		return c.list();
	}
	

}
