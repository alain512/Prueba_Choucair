package seleniumgluecode;

import cucumber.api.PendingException;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.ProtocolHandshake;

public class Test {

    private ChromeDriver driver;

    @Cuando("^ingresa a la página de New experience$")
    public void ingresa_a_la_página_de_New_experience() throws Throwable {
        System.setProperty("webdriver.chrome.driver", "E:\\git\\Prueba_Choucair\\src\\test\\resources\\chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php/");
        driver.manage().window().maximize();
    }
}
