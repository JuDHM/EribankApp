package com.bancolombia.eribank.definitions;

import java.util.List;

import org.junit.Assert;

import com.bancolombia.eribank.steps.EribAutenticarStep;
import com.bancolombia.eribank.steps.EribCargarInformacionStep;
import com.bancolombia.eribank.steps.EribPagarStep;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class EribPagosDefinition {
	
	@Steps
	EribCargarInformacionStep dataDePrueba;
	
	@Steps
	EribAutenticarStep autenticar;
	
	@Steps
	EribPagarStep pagar;
	
	@Given("^Juan abre la app de eribank$")
	public void juan_abre_la_app_de_eribank(DataTable dataCaso) throws Exception {
		
		List<List<String>> infoCaso = dataCaso.raw();
		dataDePrueba.inicializarDatos(infoCaso);
		//autenticar.inicializarDatos(infoCaso);
		autenticar.abrirApp();
	    System.out.println("1. Abrir app de eribank.");
	}

	@Given("^Juan se autentica correctamente$")
	public void juan_se_autentica_correctamente() throws Exception {
		autenticar.autenticar(dataDePrueba.getDataUsuario());
		System.out.println(pagar.validarMensaje()); 
		System.out.println("2. Autenticar en la app");
	}

	@When("^Juan realiza la ejecucion del pago$")
	public void juan_realiza_la_ejecucion_del_pago() throws Exception {
		pagar.irOpcionPagar();
		pagar.ejecutarPago(dataDePrueba.getDataPrueba());
		System.out.println("3. Ejecutar el pago en la app");
	}

	@Then("^Juan verifica el mensaje exitoso de la transaccion$")
	public void juan_verifica_el_mensaje_exitoso_de_la_transaccion() throws Exception {
		System.out.println(pagar.validarMensaje()); 
		System.out.println("4. Verificar mensaje exitoso");
	}
	
	
	@Given("^Juan se autentica con errores$")
	public void juan_se_autentica_con_errores() throws Throwable {
		autenticar.autenticar(dataDePrueba.getDataUsuario());
		//System.out.println(pagar.validarMensaje()); 
		System.out.println("1. Autenticacion con errores");
	}

	@Then("^Juan verifica el mensaje esperado$")
	public void juan_verifica_el_mensaje_esperado() throws Throwable {
		//System.out.println( autenticar.obtenerMensaje());  
		Assert.assertTrue(autenticar.estaPresenteAlertaError());
	}
	
}
