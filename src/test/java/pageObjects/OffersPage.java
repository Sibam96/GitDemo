package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OffersPage {
	
	public WebDriver driver;
	
	
	public OffersPage(WebDriver driver)
	{
		this.driver=driver;
		
	}
	By Search= By.xpath("//input[@type='search']");
	By ProductName= By.cssSelector("tbody tr td:nth-of-type(1)");
	//By topDeals= By.linkText("Top Deals");
	
	public void searchItem(String name)
	{
		
		driver.findElement(Search).sendKeys(name);
	}
	
	public void getSearchText()
	{
		driver.findElement(Search).getText();
	}
	
	public String getProductName()
	{
		 return driver.findElement(ProductName).getText();
	}
	
	

}
