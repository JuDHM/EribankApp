package com.bancolombia.eribank.steps;

import java.util.List;

import com.bancolombia.eribank.dtos.DTOPagos;
import com.bancolombia.eribank.dtos.UsuarioDTO;

public class EribCargarInformacionStep {
	
	private DTOPagos dataPrueba;
	private UsuarioDTO usuario;
	
	public DTOPagos getDataPrueba() {
		return dataPrueba;
	}
	
	public UsuarioDTO getDataUsuario() {
		return usuario;
	}
	
	public void inicializarDatos(List<List<String>> data) {
		usuario = new UsuarioDTO();
		dataPrueba = new DTOPagos();
		
		dataPrueba.setIdCaso(data.get(0).get(0));
		dataPrueba.setUsuario(data.get(0).get(1)); 
		dataPrueba.setPass(data.get(0).get(2));		
		dataPrueba.setTelefono(data.get(0).get(3));
		dataPrueba.setNombre(data.get(0).get(4));
		dataPrueba.setValorPagar(data.get(0).get(5));
		dataPrueba.setPais(data.get(0).get(6));
		
		usuario.setUsuario(dataPrueba.getUsuario());
		usuario.setPassword(dataPrueba.getPass());
		
		//return dataPrueba;
	}
}
