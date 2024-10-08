package utils;

import org.openqa.selenium.WebDriver;

import Pageobjects.PageObjectManager;

public class TestContextSetup {

	public WebDriver driver;
	public String landingpageproductname;
	public PageObjectManager pageObjectManager;
	public TestBase  testbase;
	public GenericUtils genericutils;
	
	public TestContextSetup() throws Throwable
	{
		testbase=new TestBase ();
		pageObjectManager = new PageObjectManager(testbase.WebDriverManager());
		genericutils = new GenericUtils(testbase.WebDriverManager());
	}
}
