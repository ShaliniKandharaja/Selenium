package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class LoginStepDefinition extends BaseClass{
	
	//replace Demosalesmanager with {string} --> this string will receive string input from feature file 
	@Given("Enter the username as {string}")
	public void enterUserName(String uName) { // Give Parameter --> That input will be received by parameter
		//enter UserName
				WebElement userName=driver.findElement(By.xpath("//input[@id='username']"));
				userName.sendKeys(uName); //Replace hardcoded data with uName
	}
	
	////replace crmsfa with {string}
    @And("Enter the password as {string}")
	public void enterPassword(String pWord) { //Parameterized
		//enter Password
				WebElement Password=driver.findElement(By.xpath("//input[@id='password']"));
				Password.sendKeys(pWord); //Replace hardcoded data with pName
				
	}

    @When("Click on Login button")
	public void clickLoginButton() {
		//Click Login Button
				WebElement login=driver.findElement(By.xpath("//input[@type='submit']"));
				login.click();
				
	}
	
    @Then("Homepage should be displayed")
	public void verifyHomePage() {
		
		String text=driver.findElement(By.tagName("h2")).getText();
		if(text.contains("Welcome")) {
			System.out.println("Homepage displayed");
		}
		else {
			System.out.println("Homepage is not displayed");
		}
	}
    
    @But("ErrorMessage should be displayed")
    public void verifyErrorMeassage() {
    	String text=driver.findElement(By.id("errorDiv")).getText();
		if(text.contains("Error")) {
			System.out.println("Error message is displayed");
		}
		else {
			System.out.println("Error message is not displayed");
		}
    	
		

	}


}
