package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.DataTable;

public class ContactPage {

	WebDriver driver;
	
	By NameText = By.xpath(".//*[@id='ctl00_MainContent_NameBox']");
	By EmailText = By.xpath(".//*[@id='ctl00_MainContent_EmailBox']");
	By MessageText = By.xpath(".//*[@id='ctl00_MainContent_MessageBox']");
	By SendButton = By.xpath(".//*[@id='ctl00_MainContent_SendButton']");

	public ContactPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void EnterName(String name)
	{
		// Enter search criteria
		driver.findElement(NameText).sendKeys(name);
	}
	
	public void EnterEmailText(String email)
	{
		driver.findElement(EmailText).sendKeys(email);		
	}

	public void EnterMessageText(String message)
	{
		driver.findElement(MessageText).sendKeys(message);		
	}

	public void ClickSend()
	{
		// Click on send
		driver.findElement(SendButton).click();
	}
	
}
