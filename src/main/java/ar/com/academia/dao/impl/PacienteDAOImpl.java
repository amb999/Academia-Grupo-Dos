package ar.com.academia.dao.impl;

import org.hibernate.SessionFactory;

import ar.com.academia.dao.PacienteDAO;

public class PacienteDAOImpl implements PacienteDAO {
	
	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	

}
