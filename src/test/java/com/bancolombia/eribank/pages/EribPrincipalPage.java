package com.bancolombia.eribank.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.bancolombia.eribank.core.MobilePageObject;

import io.appium.java_client.pagefactory.AndroidFindBy;

public class EribPrincipalPage extends MobilePageObject {
	
	@AndroidFindBy(id="makePaymentButton")
	private WebElement btnPagar;
	
	@AndroidFindBy(id="mortageRequestButton")
	private WebElement btnHipotecar;
	
	@AndroidFindBy(id="expenseReportButton")
	private WebElement btnReporteGastos;
	
	@AndroidFindBy(id="logoutButton")
	private WebElement btnSalir;
						 
	@AndroidFindBy(xpath=" /hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View")
	private WebElement lblMensajeSaldo;
	
	
	public EribPrincipalPage(WebDriver driver) {
		super(driver);
	}
	
	public void irAOpcionPagos() {
		btnPagar.click();
	}
	
	public void irAOpcionSolicitudHipoteca() {
		btnHipotecar.click();
	}
	
	public void irAOpcionReporteGastos() {
		btnReporteGastos.click();
	}
	
	public void irAFinalizarSesion() {
		btnSalir.click();
	}
	
	public String obtenerMensaje() {
		return lblMensajeSaldo.getText();	
	}
}
