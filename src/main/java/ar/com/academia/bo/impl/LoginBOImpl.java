package ar.com.academia.bo.impl;

import ar.com.academia.bo.LoginBO;
import ar.com.academia.dao.UsuarioDAO;

public class LoginBOImpl implements LoginBO {

	private UsuarioDAO usuarioDAO;

	public UsuarioDAO getUsuarioDAO() {
		return usuarioDAO;
	}

	public void setUsuarioDAO(UsuarioDAO usuarioDAO) {
		this.usuarioDAO = usuarioDAO;
	}

	@Override
	public Boolean validarUsuario(String usuario) {
		return usuarioDAO.validarUsuario(usuario);
	}

	@Override
	public Boolean validarPassword(String usuario, String password) {
		return usuarioDAO.validarPassword(usuario, password);
	}
}
