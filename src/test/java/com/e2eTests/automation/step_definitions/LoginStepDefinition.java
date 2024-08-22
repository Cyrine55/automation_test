package com.e2eTests.automation.step_definitions;

import java.time.Duration;

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
	
	
	/*login valid*/
	@Given("Je visite l'application NopCommerce")
	public void jeVisiteLApplicationNopCommerce() {
		Setup.getDriver().get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		
	}
	
	@When("Je saisi l'adresse mail {string}")
	public void jeSaisiLAdresseMail(String email) {
		//LoginPage.getEmail().clear();
	   // LoginPage.getEmail().sendKeys(email);
	}
	
	@When("Je saisis le login {string}")
	public void jeSaisisLeLogin(String login) {
		//LoginPage.getPassword().sendKeys(login);;
	}
	
	@When("Je clique sur le bouton Login")
	public void jeCliqueSurLeBoutonLogin() {
		LoginPage.getBtnLogin().click();;
	}
	
	@Then("Je me redirige vers la page home")
	public void jeMeRedirigeVersLaPageHome() {
	    
	}

	/*login invalid*/
	@Then("Je verifie le message d'erreur")
	public void jeVerifieLeMessageDErreur() {
	    
	}



}
