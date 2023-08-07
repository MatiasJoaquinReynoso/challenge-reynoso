package challenge_tests;



import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
//import org.testng.annotations.DataProvider;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;

public class saucedemo_tests {
	WebDriver driver;
	metodos_conexion acciones = new metodos_conexion();
	

  @BeforeTest
  public void beforeTest() {
	 driver = acciones.conectarse_firefox();
  }
	
 
  @Test
  // (dataProvider = "datos_login")
  public void SauceTests() {
      driver.findElement(By.id(metodos_elementosWeb.login_usuario)).sendKeys(metodos_datos.usuario);
      driver.findElement(By.id(metodos_elementosWeb.login_clave)).sendKeys(metodos_datos.contraseña);
      driver.findElement(By.id(metodos_elementosWeb.login_boton)).click();
      
      driver.findElement(By.id(metodos_elementosWeb.agregar_mochila)).click();

      String Cantidad;
      Cantidad = driver.findElement(By.cssSelector("#shopping_cart_container > a > span")).getText();
      if ("2".equals(Cantidad)) {
          System.out.println("Has agregado 1 item al carro de compras");
      } else {
          System.out.println("El test finalizó con errores");
          System.exit(1);
      }
  }
  
  //@DataProvider(name="datos_login")
 // public Object[][] datos() {	  
  // return new Object[][] {
  //  {"standard_user", "secret_sauce"},
  // {"problem_user", "secret_sauce"},
  // {"performance_glitch_user", "secret_sauce"}
  // };
  // }
  @AfterTest
  public void afterTest() {
	 driver.quit();
  }

}
