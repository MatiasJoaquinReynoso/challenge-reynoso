package stepDefinitions;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Features", glue= {"stepDefinitions"},
monochrome=true,
plugin = {"pretty", "html:target/Htmlreports"},
tags= "@smoketest"
)
public class testRunner {
	public static void main(String[] args) {
        // Configuración para Chrome
        WebDriver chromeDriver = new ChromeDriver();

        // Configuración para Firefox
        WebDriver firefoxDriver = new FirefoxDriver();

        // Aquí ejecutas tu caso de prueba con cada controlador
        // Por ejemplo:
        executeTestCase(chromeDriver);
        executeTestCase(firefoxDriver);

        // Cerrar los controladores al final
        chromeDriver.quit();
        firefoxDriver.quit();
    }

    public static void executeTestCase(WebDriver chromeDriver) {
        // Código para ejecutar el caso de prueba utilizando el driver proporcionado
        // Esto puede incluir cargar la página, interactuar con elementos, etc.
    }
}




