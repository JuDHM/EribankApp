package com.bancolombia.eribank.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.bancolombia.eribank.core.MobilePageObject;
import com.bancolombia.eribank.dtos.UsuarioDTO;

import io.appium.java_client.pagefactory.AndroidFindBy;

public class EribAutenticacionPage extends MobilePageObject {
	
	public EribAutenticacionPage(WebDriver driver) {
		super(driver);
	}


	@AndroidFindBy(id="usernameTextField")
	private WebElement txtUsuario;
	
	@AndroidFindBy(id="passwordTextField")
	private WebElement txtPass;
	
	@AndroidFindBy(id="loginButton")
	private WebElement btnIngresar;
	
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.TextView")
	private WebElement lblTituloError;
	
	@AndroidFindBy(id="message")
	private WebElement lblMensajeError;
	
	//@AndroidFindBy(id="button3")
	@AndroidFindBy(xpath="	/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[3]")
	private WebElement btnCerrarError;
	
	public void abrirApp() {
		
	}
	
	public void ejecutarAutenticacion(UsuarioDTO usuario) {
		txtUsuario.sendKeys(usuario.getUsuario());
		txtPass.sendKeys(usuario.getPassword());
		btnIngresar.click();
	}
	
	
	public boolean estaPresentTituloError() {
		return lblTituloError.isDisplayed() && lblTituloError.isEnabled();
	}
	
	public String getMensajeError() {
		return lblMensajeError.getText();
	}
	
	public boolean estaPresenteElBotonError() {
		return btnCerrarError.isDisplayed() && btnCerrarError.isEnabled();
	}
	
}
