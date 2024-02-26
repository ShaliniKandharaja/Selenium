package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class CreateLeadStepDefinition extends BaseClass {
	@When("Click on crmsfa Link")
	public void clickCRMSFALink() {
		//Click crmsfa link
		WebElement crmsfaLink=driver.findElement(By.xpath("//a[contains(text(),'CRM')]"));
		crmsfaLink.click();		
	}
	@And("Click on Leads link")
	public void clickLeadsLink() {
		WebElement createLead=driver.findElement(By.xpath("//a[text()='Leads']"));
		createLead.click();

	}
	@And("Click on Create Lead Link")
	public void clickCreateLeadLink() {
		WebElement createLead=driver.findElement(By.xpath("(//a[contains(text(),'Lead')])[3]"));
		createLead.click();
	}
	
	
	@Given("Enter the company name as (.*)$") // .* represent it accepts any type of data we are passing in Scenario Outline , $ --> represent this line ends 
	public void companyName(String cName) {
		driver.findElement(By.xpath("(//input[contains(@name,'company')])[2]")).sendKeys(cName);
		

	}
	@And("Enter the first name as (.*)$")
	public void firstName(String fName) {
		WebElement firstName=driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']"));
		firstName.sendKeys(fName);

	}
	@And("Enter the last name as (.*)$")
	public void lastName(String lName) {
		WebElement lastName=driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']"));
		lastName.sendKeys(lName);
	}
	@When("Click on CreateLead button")
	public void clickCreateLeadButton() {
		WebElement createLead1=driver.findElement(By.xpath("//input[@value='Create Lead']"));
		createLead1.click();
	}
	@Then("ViewLeadPage should be displayed")
	public void getpageTitle() {
		String title=driver.getTitle();
		System.out.println("Title of the page is :"+title);
	}

}
