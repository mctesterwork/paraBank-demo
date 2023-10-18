package Parabank.Definitions;

import Parabank.Pages.LoginPage;
import Parabank.Steps.Questions;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

import Parabank.Steps.Conexion;
import io.cucumber.java.en.Given;
import org.junit.Assert;

public class DefinitionsSteps {

	private WebDriver driver;
	private Conexion conexion;
	private LoginPage loginPage;
	private Questions questions;
	

	@Given("^Navigate to the site under test$")
	public void openBrowser() {
		this.conexion = new Conexion();
		this.driver = this.conexion.openBrowser();
	}

	@When("^I submit username (.*) and password (.*)$")
	public void login(String username, String password) {
		this.loginPage = new LoginPage(driver);
		loginPage.submitLogin(username, password);
	}

	@Then("I should see the login error")
	public void checkErrorMessage() {
		 questions = new Questions(driver);
		 questions.elementExists("//h1[contains(text(), 'Error')]");

	}

}