package stepDefinition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import pages.HomePage;
import pages.ContactPage;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

import org.testng.*;

public class QAWorksContact{
	WebDriver driver = new FirefoxDriver();

	
	@Given("^I am on the QAWorks Site$")
	public void i_am_on_the_QAWorks_Site() throws Throwable {
		// Calling methods in HomePage
		HomePage HomePage = new HomePage(driver);
		
		HomePage.NavigatetoSite();
		// Click Contact
		HomePage.ClickonContactLink();
		
	}

	@Then("^I should be able to contact QAWorks with the following information$")
	public void i_should_be_able_to_contact_QAWorks_with_the_following_information(DataTable contactdetails) throws Throwable {

		//Write the code to handle Data Table
		List<List<String>> data = contactdetails.raw();

		ContactPage ContactPage = new ContactPage(driver);
		ContactPage.EnterName(data.get(0).get(1));
		ContactPage.EnterEmailText(data.get(1).get(1));
		ContactPage.EnterMessageText(data.get(2).get(1));
		ContactPage.ClickSend();			
	}
	
}
