package com.bancolombia.eribank.steps;

import com.bancolombia.eribank.dtos.DTOPagos;
import com.bancolombia.eribank.pages.EribPagoPage;
import com.bancolombia.eribank.pages.EribPrincipalPage;

public class EribPagarStep {
	
	EribPrincipalPage principal;
	EribPagoPage pago;
	
	
	public void irOpcionPagar() {
		principal.irAOpcionPagos();
	}
	
	public void ejecutarPago(DTOPagos pagos) {
		pago.ejecutarPago(pagos);
	}
	
	public String validarMensaje() {
		return principal.obtenerMensaje();
	}
	
}
