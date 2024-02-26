package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethods;

public class CreateLeadPage extends ProjectSpecificMethods  {

	public CreateLeadPage(ChromeDriver driver) {
		this.driver=driver;
	}

	public CreateLeadPage firstName(String fName) {
		WebElement firstName=driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']"));
		firstName.sendKeys(fName);
		return this;

	}

	public CreateLeadPage lastName(String lName) {
		WebElement lastName=driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']"));
		lastName.sendKeys(lName);
		return this;


	}

	public CreateLeadPage companyName(String cName) {
		WebElement companyName=driver.findElement(By.xpath("(//input[contains(@name,'company')])[2]"));
		companyName.sendKeys(cName);
		return this;


	}
	
	public ViewLeadPage clickCreateLeadButton() {
		WebElement createLead1=driver.findElement(By.xpath("//input[@name='submitButton']"));
		createLead1.click();
		return new ViewLeadPage(driver);
	}

}
