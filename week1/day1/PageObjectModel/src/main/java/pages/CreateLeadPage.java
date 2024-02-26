package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import base.ProjectSpecificMethods;

public class CreateLeadPage extends ProjectSpecificMethods  {

	public CreateLeadPage firstName() {
		WebElement firstName=driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']"));
		firstName.sendKeys("Kandharaja");
		return this;

	}

	public CreateLeadPage lastName() {
		WebElement lastName=driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']"));
		lastName.sendKeys("G");
		return this;


	}

	public CreateLeadPage companyName() {
		WebElement companyName=driver.findElement(By.xpath("(//input[contains(@name,'company')])[2]"));
		companyName.sendKeys("Farming Land");
		return this;


	}
	
	public ViewLeadPage clickCreateLeadButton() {
		WebElement createLead1=driver.findElement(By.xpath("//input[@value='Create Lead']"));
		createLead1.click();
		return new ViewLeadPage();
	}

}
