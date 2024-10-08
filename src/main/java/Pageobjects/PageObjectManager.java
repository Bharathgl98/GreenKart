package Pageobjects;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {

	public LandingPage landingPage ;
	public Offerspage offerspage;
	public WebDriver driver;
	public CheckoutPage checkoutpage;
	
	public PageObjectManager(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public LandingPage getLandingPage()
	{
		landingPage = new LandingPage(driver);
		return landingPage;
	}
	public Offerspage getOfferspage()
	{
		offerspage = new Offerspage(driver);
		return offerspage;
	}
	public CheckoutPage getCheckoutPage ()
	{
		checkoutpage = new CheckoutPage(driver);
		return checkoutpage;
	}
}
