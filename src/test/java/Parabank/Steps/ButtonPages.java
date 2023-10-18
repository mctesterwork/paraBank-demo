package Parabank.Steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ButtonPages {
    @FindBy(how = How.XPATH, using="//input[@value='Log In']")
    private WebElement btnLogin;

    public ButtonPages (WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void btnLogin() {
        btnLogin.click();
    }
}
