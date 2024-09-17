package com.e2eTests.automation.step_definitions;

import com.e2eTests.automation.page_Objects.LoginPage;
import com.e2eTests.automation.utils.ConfigFileReader;
import com.e2eTests.automation.utils.SeleniumUtils;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinition {

	public LoginPage loginPage;
	public ConfigFileReader configFileReader;
	public SeleniumUtils seleniumUtils;

	public LoginStepDefinition() {
		loginPage = new LoginPage();
		configFileReader = new ConfigFileReader();
		seleniumUtils = new SeleniumUtils();
	}

	/* login valid */
	@Given("Je visite l'application NopCommerce")
	public void jeVisiteLApplicationNopCommerce() throws InterruptedException {
		
		seleniumUtils.get(configFileReader.getProperties("home.url"));
		Thread.sleep(3000);
	}
 
	@When("Je saisi l'adresse mail {string}")
	public void jeSaisisLAdresseMail(String email) {
		
		seleniumUtils.writeText(LoginPage.getEmail(), email);
	}

	
	@When("Je saisis le login {string}")
	public void jeSaisisLeLogin(String login) {
		
		seleniumUtils.writeText(LoginPage.getPassword(), login);
	}

	@When("Je clique sur le bouton Login")
	public void jeCliqueSurLeBoutonLogin() {
		
		seleniumUtils.click(LoginPage.getBtnLogin());
	}

	@Then("Je me redirige vers la page home")
	public void jeMeRedirigeVersLaPageHome() {
	}

	/* login invalid */
	@Then("Je verifie le message d'erreur")
	public void jeVerifieLeMessageDErreur() {
	}
	
	/*Outline*/
	@Then("Je verifie le message {string}")
	public void jeVerifieLeMessage(String message) {
	}

}