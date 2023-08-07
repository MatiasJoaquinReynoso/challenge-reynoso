package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import challenge_tests.metodos_conexion;
import challenge_tests.metodos_datos;
import challenge_tests.metodos_elementosWeb;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class inventorySteps {
	WebDriver driver;
	metodos_conexion acciones = new metodos_conexion();
	@Given("el usuario ingresa al sitio web sauce demo.")
	public void el_usuario_ingresa_al_sitio_web_sauce_demo() {
		driver = acciones.conectarse_chrome();	
	}

	@When("usuario ingresa Usuario y Contraseña correctamente.")
	public void usuario_ingresa_usuario_y_contraseña_correctamente() {
	      driver.findElement(By.id(metodos_elementosWeb.login_usuario)).sendKeys(metodos_datos.usuario);
	      driver.findElement(By.id(metodos_elementosWeb.login_clave)).sendKeys(metodos_datos.contraseña);
	}

	@When("hace click en el boton login.")
	public void hace_click_en_el_boton_login() {
		driver.findElement(By.id(metodos_elementosWeb.login_boton)).click();
	}

	@Then("una vez redirigido al sitio correspondiente, el usuario hace click en un item.")
	public void una_vez_redirigido_al_sitio_correspondiente_el_usuario_hace_click_en_un_item() {
		String strUrl = driver.getCurrentUrl();
	    System.out.println("Current Url is:"+ strUrl);
	    driver.findElement(By.id(metodos_elementosWeb.agregar_mochila)).click();
	}

	@Then("debe figurar la cantidad seleccionada en el carro de compras.")
	public void debe_figurar_la_cantidad_seleccionada_en_el_carro_de_compras() {
		String Cantidad;
	      Cantidad = driver.findElement(By.cssSelector("#shopping_cart_container > a > span")).getText();
	      if ("1".equals(Cantidad)) {
	          System.out.println("Has agregado 1 item al carro de compras");
	      } else {
	          System.out.println("El test finalizó con errores");
	          System.exit(1);
	      }
	      acciones.desconectarse();
	}
	
}