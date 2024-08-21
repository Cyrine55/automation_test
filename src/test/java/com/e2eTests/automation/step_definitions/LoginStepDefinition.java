package com.e2eTests.automation.step_definitions;

import com.e2eTests.automation.page_Objects.LoginPage;
import com.e2eTests.automation.utils.Setup;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinition {
	public LoginPage loginPage;
	
	public LoginStepDefinition() {
		loginPage= new LoginPage();
	}
	
	@Given("Je visite l'application NopCommerce")
	public void jeVisiteLApplicationNopCommerce() throws InterruptedException {
		Setup.getDriver().get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		Thread.sleep(90000);
	}
	
	@When("Je saisi l'adresse mail {string}")
	public void jeSaisiLAdresseMail(String email) {
	    LoginPage.getEmail().sendKeys(email);
	}
	
	@When("Je saisis le login {string}")
	public void jeSaisisLeLogin(String login) {
		LoginPage.getPassword().clear();
		LoginPage.getPassword().sendKeys(login);;
	}
	
	@When("Je clique sur le bouton Login")
	public void jeCliqueSurLeBoutonLogin() {
		LoginPage.getBtnLogin();
	}
	
	@Then("Je me redirige vers la page home")
	public void jeMeRedirigeVersLaPageHome() {
	    
	}



}
