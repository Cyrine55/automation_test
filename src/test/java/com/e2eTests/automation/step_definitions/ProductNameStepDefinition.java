package com.e2eTests.automation.step_definitions;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.e2eTests.automation.page_Objects.ProductNamePage;


import io.cucumber.java.en.When;

public class ProductNameStepDefinition {

	public ProductNamePage productNamePage;
	public WebDriverWait wait;

	public ProductNameStepDefinition() {
		productNamePage = new ProductNamePage();
	}

	@When("Je clique sur Catalog")
	public void jeCliqueSurCatalog() {
		
		ProductNamePage.getMenuCatalog().click();
	    
	}
	@When("Je clique sur Products")
	public void jeCliqueSurProducts() throws InterruptedException {
		Thread.sleep(3000);
		ProductNamePage.getMenuProduct().click();
	}
	@When("Je saisis le nom du produit {string}")
	public void jeSaisisLeNomDuProduit(String productName) {
		ProductNamePage.getProductName().sendKeys(productName);
	}
	@When("Je clique sur le bouton search")
	public void jeCliqueSurLeBoutonSearch() {
		ProductNamePage.getBtnSearch().click();
	}



}
