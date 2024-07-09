package com.distribuida.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.distribuida.entities.TipoPago;

@Repository
public class TipoPagoDAOImpl implements TipoPagoDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	@Transactional
	public List<TipoPago> findALL() {
		Session session = sessionFactory.getCurrentSession();
		
		return session.createQuery("from TipoPago", TipoPago.class).getResultList();
		
	}

	@Override
	public TipoPago findOne(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(TipoPago tipoPago) {
		// TODO Auto-generated method stub

	}

	@Override
	public void up(TipoPago tipoPago) {
		// TODO Auto-generated method stub

	}

	@Override
	public void del(int id) {
		// TODO Auto-generated method stub

	}

}
