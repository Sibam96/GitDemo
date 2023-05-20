package stepDefinitions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LandingPage;
import pageObjects.OffersPage;
import pageObjects.PageObjectManager;
import utils.TestContextSetup;

public class OfferPageStepDefinition {
	
	public WebDriver driver;
	public String LandingproductName;
	public String OfferPageProductName;
	TestContextSetup testContextSetup;
	PageObjectManager pageObjectManager;
	
	
	public OfferPageStepDefinition(TestContextSetup testContextSetup)
	{
		this.testContextSetup=testContextSetup;
	}
	
	@Then("^User searched for (.+) shortname in offers page$")
	public void user_searched_for_same_shortname_in_offers_page_to_check_if_product_exist(String shortName) throws InterruptedException {
		
		switchToOffersPage();
		
		OffersPage offersPage= testContextSetup.pageObjectManager.OffersPage();
		offersPage.searchItem(shortName);
		Thread.sleep(2000);
		OfferPageProductName=offersPage.getProductName();
	   
	}
	
	public void  switchToOffersPage()
	{
		
		//pageObjectManager=new PageObjectManager(testContextSetup.driver);
		LandingPage landingPage= testContextSetup.pageObjectManager.getLandingPage();
		landingPage.selectTopDealsPage();
	/*	Set<String> s1=testContextSetup.driver.getWindowHandles();
		s1.iterator();
		Iterator<String> i1= s1.iterator();
		String ParentWindow=i1.next();
		String ChildWindow=i1.next();
		
		testContextSetup.driver.switchTo().window(ChildWindow);
		*/
		testContextSetup.genericUtils.SwitchWindowToChild();
		
	}
	@Then ("validate product name in offers page matches with Landing Page")
	public void validate_product_name_in_offers_page() {
		
		Assert.assertEquals(OfferPageProductName,testContextSetup.LandingproductName);
		
		
		
	}

}
