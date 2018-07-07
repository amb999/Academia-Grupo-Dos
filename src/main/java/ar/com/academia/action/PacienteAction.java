package ar.com.academia.action;

import java.time.LocalDate;

import com.opensymphony.xwork2.ActionSupport;

import ar.com.academia.bean.Plan;
import ar.com.academia.bo.PacienteBO;

public class PacienteAction extends ActionSupport {
	
	private int nroDeAfiliado;
	private String nombreYApellido;
	private int edad;
	private String tipoDNI;
	private int DNI;
	private LocalDate fechaDeNacimiento;
	private String sexo;
	private int telefono;
	private String direccion;
	private String estadoCivil;
	private String mail;
	private int numeroPlan;
	private Plan planmedico;
	private int cantidadHijos;
	
	private PacienteBO pacienteBO;

	public int getNroDeAfiliado() {
		return nroDeAfiliado;
	}

	public void setNroDeAfiliado(int nroDeAfiliado) {
		this.nroDeAfiliado = nroDeAfiliado;
	}

	public String getNombreYApellido() {
		return nombreYApellido;
	}

	public void setNombreYApellido(String nombreYApellido) {
		this.nombreYApellido = nombreYApellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getTipoDNI() {
		return tipoDNI;
	}

	public void setTipoDNI(String tipoDNI) {
		this.tipoDNI = tipoDNI;
	}

	public int getDNI() {
		return DNI;
	}

	public void setDNI(int dNI) {
		DNI = dNI;
	}

	public LocalDate getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}

	public void setFechaDeNacimiento(LocalDate fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public Plan getPlanmedico() {
		return planmedico;
	}

	public void setPlanmedico(Plan planmedico) {
		this.planmedico = planmedico;
	}

	public PacienteBO getPacienteBO() {
		return pacienteBO;
	}

	public void setPacienteBO(PacienteBO pacienteBO) {
		this.pacienteBO = pacienteBO;
	}
	
	
}
