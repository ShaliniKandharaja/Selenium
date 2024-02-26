package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import base.ProjectSpecificMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class CreateLeadPage extends ProjectSpecificMethods  {

	@Given("Enter the first name as (.*)$")
	public CreateLeadPage firstName(String fName) {
		WebElement firstName=driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']"));
		firstName.sendKeys(fName);
		return this;

	}

	@And("Enter the last name as (.*)$")
	public CreateLeadPage lastName(String lName) {
		WebElement lastName=driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']"));
		lastName.sendKeys(lName);
		return this;


	}

	@And("Enter the company name as (.*)$")
	public CreateLeadPage companyName(String cName) {
		WebElement companyName=driver.findElement(By.xpath("(//input[contains(@name,'company')])[2]"));
		companyName.sendKeys(cName);
		return this;


	}
	
	@When("Click on CreateLead button")
	public ViewLeadPage clickCreateLeadButton() {
		WebElement createLead1=driver.findElement(By.xpath("//input[@value='Create Lead']"));
		createLead1.click();
		return new ViewLeadPage();
	}

}
