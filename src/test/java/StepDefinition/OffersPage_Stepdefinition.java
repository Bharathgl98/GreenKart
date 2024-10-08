package StepDefinition;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import Pageobjects.LandingPage;
import Pageobjects.Offerspage;
import Pageobjects.PageObjectManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.TestContextSetup;

public class OffersPage_Stepdefinition {
	public WebDriver driver;
	public String landingpageproductname;
	public String offerpageproduct;
	TestContextSetup testContextSetup;
	PageObjectManager pageObjectManager;

	public OffersPage_Stepdefinition(TestContextSetup testContextSetup) {
		this.testContextSetup = testContextSetup;
	}

	@Then("^User serached for (.+) shotname in offers page$")
	public void user_serached_for_shotname_in_offers_page(String shortName) throws Throwable {
		switchToOffersPage();
		Offerspage offerspage = new Offerspage(testContextSetup.driver);
		offerspage.searchItem(shortName);
		Thread.sleep(2000);
		offerpageproduct = offerspage.getProductName();
	}

	public void switchToOffersPage() {
		// if(testContextSetup.driver.getCurrentUrl().equalsIgnoreCase("https://rahulshettyacademy.com/seleniumPractise/#/offers"))
		
		LandingPage landingPage=testContextSetup.pageObjectManager.getLandingPage();
		landingPage.selectToDealspage();
		testContextSetup.genericutils.SwitchWindowToChild();
	}

	@Then("validate product name in offers page match with Landing page")
	public void validate_product_name_in_offers_page_match_with_landing_page() {
		Assert.assertEquals(offerpageproduct, testContextSetup.landingpageproductname);
	}

}
