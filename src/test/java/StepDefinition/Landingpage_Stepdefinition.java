package StepDefinition;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import Pageobjects.LandingPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.TestContextSetup;

public class Landingpage_Stepdefinition {
	public WebDriver driver;
	public String landingpageproductname;
	public String offerpageproduct;
	TestContextSetup testContextSetup;
	LandingPage landingPage;

	public Landingpage_Stepdefinition(TestContextSetup testContextSetup) {
		this.testContextSetup = testContextSetup;
		this.landingPage =testContextSetup.pageObjectManager.getLandingPage();
	}

	@Given("User is on GreenKart Landing page")
	public void user_is_on_green_kart_landing_page() {
		
      Assert.assertTrue(landingPage.getTitleLandingPage().contains("GreenKart"));
	}

	@When("^User searched with shortname (.+) and extracted actual name of product$")
	public void user_searched_with_shortname_and_extracted_actual_name_of_product(String shortName) throws Throwable {
		
		landingPage.searchItem(shortName);
		Thread.sleep(2000);
		testContextSetup.landingpageproductname = landingPage.getProductName().split("-")[0].trim();
		System.out.println(landingpageproductname + " is extracted from Home page ");

	}
	
	
	@When("Added {string} items of the selected product to cart")
	public void added_items_of_the_selected_product_to_cart(String quantity) {
		landingPage.incrementQuantity( Integer.parseInt(quantity));
		landingPage.addToCart();
	}

}
