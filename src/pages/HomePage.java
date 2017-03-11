package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	
	WebDriver driver;
		
	By ContactLink = By.xpath(".//*[@id='menu']/li[1]/a");
		
	public HomePage(WebDriver driver)
	{
		this.driver = driver;
	}

	public void NavigatetoSite()
	{
		// Go to site
		driver.get("http://www.qaworks.com");
	}
	
	
	public void ClickonContactLink()
	{
		// Click on Contact link
		driver.findElement(ContactLink).click();
	}
	
}
