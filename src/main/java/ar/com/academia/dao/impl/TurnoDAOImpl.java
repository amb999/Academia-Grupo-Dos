package ar.com.academia.dao.impl;

import org.hibernate.SessionFactory;

import ar.com.academia.dao.TurnoDAO;

public class TurnoDAOImpl implements TurnoDAO {
	
	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	

}
