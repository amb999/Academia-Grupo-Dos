package ar.com.academia.action;

import com.opensymphony.xwork2.ActionSupport;

import ar.com.academia.bo.LoginBO;

public class LoginAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	
	private String usuario;
	private String password;
	private String mensaje;
	
	private LoginBO loginBO;
	
	@Override
    public String execute() throws Exception {
        mensaje = "Bienvenido:";
        return ActionSupport.SUCCESS;
    }
	
	@Override
	public void validate() {
        if (null == usuario || usuario.length() == 0) {
            addActionError(getText("error.usuario.requerido"));
        } else if (null == password || password.length() == 0) {
            addActionError(getText("error.password.requerido"));
        } else if (!loginBO.validarUsuario(usuario)) {
            addActionError(getText("error.usuario.inexistente"));
        } else if (!loginBO.validarPassword(usuario, password)) {
            addActionError(getText("error.password.erroneo"));
        }
    }
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getUsuario() {
		return usuario;
	}
	
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	
	public String getMensaje() {
		return mensaje;
	}
	
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public LoginBO getLoginBO() {
		return loginBO;
	}

	public void setLoginBO(LoginBO loginBO) {
		this.loginBO = loginBO;
	}
}
  