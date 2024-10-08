package StepDefinition;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import Pageobjects.CheckoutPage;
import Pageobjects.LandingPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.TestContextSetup;

public class CheckoutPage_Stepdefinition {
	public WebDriver driver;
	public String landingpageproductname;
	public String offerpageproduct;
	public CheckoutPage checkoutPage;
	TestContextSetup testContextSetup;
	

	public CheckoutPage_Stepdefinition(TestContextSetup testContextSetup) {
		this.testContextSetup = testContextSetup;
		this.checkoutPage = testContextSetup.pageObjectManager.getCheckoutPage();
	}

	
	@Then("verify  user has ability to enter promo code and place the order")
	public void verify_user_has_ability_to_enter_promo_code_and_place_the_order() {
		Assert.assertTrue(checkoutPage.VerifyPlaceorder());
		Assert.assertTrue(checkoutPage.VerifyPromoBtn());
	}

	@Then("^User proceeds to Checkout and validate the (.+) items in checkout page$")
	public void User_proceeds_to_Checkout (String name) throws Throwable
	{
	   checkoutPage.CheckoutItems();
	  
	}

}
