package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import challenge_tests.metodos_conexion;
import challenge_tests.metodos_datos;
import challenge_tests.metodos_elementosWeb;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginSteps {
	WebDriver driver;
	metodos_conexion acciones = new metodos_conexion();
	@Given("el usuario se encuentra en la ventana de login del sitio web sauce demo.")
	public void verifyLoginPage() {
		driver = acciones.conectarse_chrome();		
	}


	@When("usuario ingresa standard_user y secret_sauce")
	public void usuario_ingresa_standard_user_y_secret_sauce() {
	    driver.findElement(By.id(metodos_elementosWeb.login_usuario)).sendKeys(metodos_datos.usuario);
	    driver.findElement(By.id(metodos_elementosWeb.login_clave)).sendKeys(metodos_datos.contraseña);
	}

	@When("hace click en el boton login")
	public void hace_click_en_el_boton_login() {
		driver.findElement(By.id(metodos_elementosWeb.login_boton)).click();
	}
	@Then("el usuario es redirigido a la ventana de inventario.")
	public void el_usuario_es_redirigido_a_la_ventana_de_inventario() {
		String strUrl = driver.getCurrentUrl();
	    System.out.println("Current Url is:"+ strUrl);
	    if(strUrl.contains("Inventory")) {
	    	System.out.println("La url contiene la palabra inventory");
	    }else {
	    	System.out.println("La url no contiene la palabra buscada");
	    }
	    
	    acciones.desconectarse();
	}
	

}
