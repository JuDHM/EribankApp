package com.bancolombia.eribank.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.bancolombia.eribank.core.MobilePageObject;
import com.bancolombia.eribank.dtos.DTOPagos;

import io.appium.java_client.MobileElement;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import net.thucydides.core.webdriver.WebDriverFacade;

public class EribPagoPage extends MobilePageObject {
	
	@AndroidFindBy(id="phoneTextField")
	private WebElement txtTelefono;
	
	@AndroidFindBy(id="nameTextField")
	private WebElement txtNombre;
	
	@AndroidFindBy(id="amountTextField")
	private WebElement txtValor;
	
	@AndroidFindBy(id="countryButton")
	private WebElement btnPaises;
	
	@AndroidFindBy(id="sendPaymentButton")
	private WebElement btnEnviarPago;
	
	@AndroidFindBy(id="rowTextView")
	private List<WebElement> listPaises;
	
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.LinearLayout/android.widget.Button[1]")
	private WebElement btnOpcionSi;
	
	
	public EribPagoPage(WebDriver driver) {
		super(driver);
	}

	
	public void ingresarTelefono(String telefono) {
		txtTelefono.sendKeys(telefono);
	}
	
	public void ingresarNombre(String nombre) {
		txtNombre.sendKeys(nombre);
	}
	
	public void ingresarValor(String valor) {
		txtValor.sendKeys(valor);
	}
	
	public void seleccionarPais(String pais) {
		for (WebElement item : listPaises) {
			if(item.getText().equalsIgnoreCase(pais)) {
				item.click();
				break;
			}
			swipe();
		}
	} 
	
	
	public void ejecutarPago(DTOPagos pagos) {
		ingresarTelefono(pagos.getTelefono());
		ingresarNombre(pagos.getNombre());
		ingresarValor(pagos.getValorPagar());
		btnPaises.click();
		seleccionarPais(pagos.getPais());
		btnEnviarPago.click();
		btnOpcionSi.click();
		//seleccionarPais();
		//btnEnviarPago.click();
	}
	
	
	
	public void swipe() {
		new TouchAction((PerformsTouchActions) ((AndroidDriver<MobileElement>) ((WebDriverFacade) getDriver())
				.getProxiedDriver())).longPress(0, 990).moveTo(0, 250).release().perform();
	}
}
