package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import base.ProjectSpecificMethods;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class WelcomePage extends ProjectSpecificMethods {
	

	@Then("Homepage should be displayed")
	public WelcomePage verifyLogin() {
		
		String text=driver.findElement(By.tagName("h2")).getText();
		if(text.contains("Welcome")) {
			System.out.println("Logged in successfully");
		}
		else {
			System.out.println("Login is not successfull");
		}
		return this;
		
	}
	
	@When("Click on crmsfa Link")
	public HomePage clickCRMSFALink() {
		
		//Click crmsfa link
				WebElement crmsfaLink=driver.findElement(By.xpath("//a[contains(text(),'CRM')]"));
				crmsfaLink.click();
				return new HomePage();

	}

}
