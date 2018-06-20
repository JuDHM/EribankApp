package com.bancolombia.eribank.dtos;

public class DTOPagos {
	
	private String idCaso;
	private String usuario;
	private String pass;
	private String telefono;
	private String nombre;
	private String valorPagar;
	private String pais;
	
	
	public String getIdCaso() {
		return idCaso;
	}
	
	public void setIdCaso(String idCaso) {
		this.idCaso = idCaso;
	}
	
	public String getUsuario() {
		return usuario;
	}
	
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	
	public String getPass() {
		return pass;
	}
	
	public void setPass(String pass) {
		this.pass = pass;
	}
	
	public String getTelefono() {
		return telefono;
	}
	
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getValorPagar() {
		return valorPagar;
	}
	
	public void setValorPagar(String valorPagar) {
		this.valorPagar = valorPagar;
	}
	
	public String getPais() {
		return pais;
	}
	
	public void setPais(String pais) {
		this.pais = pais;
	}
	
}
