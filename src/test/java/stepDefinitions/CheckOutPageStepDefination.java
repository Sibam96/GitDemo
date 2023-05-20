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
import pageObjects.CheckOutPage;
import pageObjects.LandingPage;
import utils.TestContextSetup;

public class CheckOutPageStepDefination {
	
	public WebDriver driver;
	public String LandingproductName;
	public String OfferPageProductName;
	TestContextSetup testContextSetup;
	public CheckOutPage checkOutPage;
	
	public CheckOutPageStepDefination(TestContextSetup testContextSetup)
	{
		this.testContextSetup=testContextSetup;
		this.checkOutPage=testContextSetup.pageObjectManager.getCheckOutPage();
	}
	
	@Then("verify user has ability to enter promo code and place the order")
	public void verify_user_has_ability_to_enter_promo_code()
	{
		
		
		Assert.assertTrue(checkOutPage.VerifyPromoBtn());       
		Assert.assertTrue(checkOutPage.VerifyPlaceOrder());
		
	}
	
	@Then ("^User proceeds to Checkout and validate the (.+) items in checkout page$")
	public void User_proceeds_to_Checkout(String name) throws InterruptedException
	{
		checkOutPage.CheckoutItems();
		
		
	}
	
	
	
	
	
	
	

}
