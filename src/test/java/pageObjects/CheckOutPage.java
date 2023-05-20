package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckOutPage {
	
	public WebDriver driver;
	
	
	public CheckOutPage(WebDriver driver)
	{
		this.driver=driver;
		
	}
	By cartBag= By.cssSelector("[alt='Cart']");
	By checkOutButton= By.xpath("//button[text()='PROCEED TO CHECKOUT']");
	By promoBtn= By.cssSelector(".promoBtn");
	By placeOrder= By.xpath("//button[text()='Place Order']");
	
	public void CheckoutItems()
	{
		
		driver.findElement(cartBag).click();
		driver.findElement(checkOutButton).click();
		System.out.println("PostJira2");
		System.out.println("PostJira3");
		System.out.println("PostJira4");
		System.out.println("PostJira5");
	}
    public Boolean VerifyPromoBtn()
    {
    	
    	return driver.findElement(promoBtn).isDisplayed();
    }
    
    public Boolean VerifyPlaceOrder()
    {
    	
    	return driver.findElement(placeOrder).isDisplayed();
    }
    
    

}
