package Parabank.Steps;

import java.io.IOException;
import java.time.Duration;
import java.util.Date;
import java.io.File;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.junit.Assert;

import com.ibm.icu.text.SimpleDateFormat;

import net.thucydides.core.annotations.Step;

public class Questions {

	private WebDriver driver;

	public Questions (WebDriver driver){
		this.driver = driver;
	}

	@Step
	public void tituloAssert() {

		String ActualTitle = driver.getTitle();
		Assert.assertEquals(ActualTitle, "Booking.com");
	}

	@Step
	public void screenShot() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		File scr = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String timestamp = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		File dest = new File("./Screenshot" + timestamp + ".png");
		try {
			FileUtils.copyFile(scr, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}

	@Step
	public void elementExists(String xpath) {
		List<WebElement> elements = driver.findElements(By.xpath(xpath));
        Assert.assertFalse("There should be an error message", elements.isEmpty());
	}

	@Step
	public void textoCrearCuentaAssert() {

		Assert.assertEquals("Crea una contraseña", "Crea una contraseña");
	}
}