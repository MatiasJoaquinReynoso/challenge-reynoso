package challenge_tests;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class metodos_conexion {
	
	WebDriver driver;
	
	public WebDriver conectarse_chrome() {
		ChromeOptions nuevoargumento = new ChromeOptions();
		nuevoargumento.addArguments(metodos_datos.options_chrome);
		driver = new ChromeDriver(nuevoargumento);
		driver.get(metodos_datos.web_test1);
		driver.manage().window().maximize();
		return driver;
	}
	
	public WebDriver conectarse_firefox() {
		driver = new FirefoxDriver();
		driver.get(metodos_datos.web_test1);
		driver.manage().window().maximize();
		return driver;
	}
	
	public void desconectarse() {
		driver.close();
	}

}