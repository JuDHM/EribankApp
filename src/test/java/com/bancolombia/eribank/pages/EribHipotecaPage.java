package com.bancolombia.eribank.pages;

import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;

public class EribHipotecaPage extends PageObject {
	
	@FindBy(id="nameTextField")
	private WebElement txtNombre;
	
	@FindBy(id="lastNameTextField")
	private WebElement txtApellido;
	
	@FindBy(id="ageTextField")
	private WebElement txtEdad;
	
	@FindBy(id="addressOneTextField")
	private WebElement txtPrimeraDireccion;
	
	@FindBy(id="addressTwoTextField")
	private WebElement txtSegundaDireccion;
	
	@FindBy(id="countryButton")
	private WebElement btnPaises;
	
	@FindBy(id="nextButton")
	private WebElement btnSiguiente;
	
	
}
