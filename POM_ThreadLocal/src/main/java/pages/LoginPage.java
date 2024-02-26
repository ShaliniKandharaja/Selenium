package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import base.ProjectSpecificMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class LoginPage extends ProjectSpecificMethods{
	

	@Given("Enter the username as {string}")
	public LoginPage enterUserName(String uName) {
		//enter UserName
				WebElement userName=getDriver().findElement(By.xpath("//input[@id='username']"));
				userName.sendKeys(uName);
				;// Going to stay in same page
				// LoginPage lp1=new LoginPage();
				//return lp1;
				return this; //this represent --> Current class object
	}

	@And("Enter the password as {string}")
	public LoginPage enterPassword(String pWord) {
		//enter Password
				WebElement Password=getDriver().findElement(By.xpath("//input[@id='password']"));
				Password.sendKeys(pWord);
				return this;
	}

	@When("Click on Login button")
	public WelcomePage clickLoginButton() {
		//Click Login Button
				WebElement login=getDriver().findElement(By.xpath("//input[@type='submit']"));
				login.click();
				//WelcomePage wp=new WelcomePage();
				//return wp;
				return new WelcomePage(); //wp is equalant to new WelcomePage()
	}


}
