package ar.com.academia.bo.impl;

import ar.com.academia.bo.PacienteBO;
import ar.com.academia.dao.PacienteDAO;

public class PacienteBOImpl implements PacienteBO{
	
	private PacienteDAO pacienteDAO;

	public PacienteDAO getPacienteDAO() {
		return pacienteDAO;
	}

	public void setPacienteDAO(PacienteDAO pacienteDAO) {
		this.pacienteDAO = pacienteDAO;
	}
	
	

}
