package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class StepDefinition {
	public ChromeDriver driver;
	
	@Given("Launch the browser")
	public void launchBroswer(){
		driver=new ChromeDriver();
	}
	
	@And("Load the url")
	public void loadURL() {
		driver.get("http://leaftaps.com/opentaps/");

	}
	
	@And("Enter the username as Demosalesmanager")
	public void enterUserName() {
		//enter UserName
				WebElement userName=driver.findElement(By.xpath("//input[@id='username']"));
				userName.sendKeys("Demosalesmanager");
	}
				
    @And("Enter the password as crmsfa")
	public void enterPassword() {
		//enter Password
				WebElement Password=driver.findElement(By.xpath("//input[@id='password']"));
				Password.sendKeys("crmsfa");
				
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


}
