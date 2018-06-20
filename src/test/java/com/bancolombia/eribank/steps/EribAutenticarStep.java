package com.bancolombia.eribank.steps;

import java.util.List;

import com.bancolombia.eribank.dtos.DTOPagos;
import com.bancolombia.eribank.dtos.UsuarioDTO;
import com.bancolombia.eribank.pages.EribAutenticacionPage;

public class EribAutenticarStep {
	
	EribAutenticacionPage autenticar;
	
	public void abrirApp() {
		autenticar.abrirApp();
	}
	
	public void autenticar(UsuarioDTO user) {
		//autenticar.ejecutarAutenticacion(UsuarioDTO usuario);
		autenticar.ejecutarAutenticacion(user);
	}
	
	public boolean estaPresenteAlertaError() {
		return autenticar.estaPresentTituloError() && autenticar.estaPresenteElBotonError();
	}
}
