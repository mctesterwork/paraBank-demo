package Parabank.Steps;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.Before;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.chrome.ChromeOptions;

public class Conexion {

	@Before
	@Step
	public WebDriver openBrowser() {
		WebDriver driver;
		String chromeDriverPath = "Drivers/chromedriver";
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver", chromeDriverPath);
		driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.navigate().to("https://parabank.parasoft.com/parabank/index.htm");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		
		return driver;

	}
	

}
