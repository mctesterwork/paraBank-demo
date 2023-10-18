package Parabank.Pages;
import Parabank.Steps.ButtonPages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    @FindBy(how = How.NAME, using = "username")
    private WebElement inputUsername;

    @FindBy(how = How.NAME, using = "password")
    private WebElement inputPassword;

    private ButtonPages buttonPages;

    public LoginPage (WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.buttonPages = new ButtonPages(driver);
    }

    public void submitLogin(String username, String password) {
        inputUsername.isDisplayed();
        inputUsername.sendKeys(username);
        inputPassword.sendKeys(password);
        buttonPages.btnLogin();
    }

}
