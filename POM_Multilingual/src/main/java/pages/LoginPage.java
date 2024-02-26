package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethods;
import config.ConfigurationManager;

public class LoginPage extends ProjectSpecificMethods{
	
	public LoginPage(ChromeDriver driver) {  //Default constructor explicitly mentioned to get driver value
		this.driver=driver;
	}

	public LoginPage enterUserName(String uName) {
		//enter UserName
				WebElement userName=driver.findElement(By.xpath("//input[@id='username']"));
				userName.sendKeys(ConfigurationManager.configuration().getUserName());
				;// Going to stay in same page
				// LoginPage lp1=new LoginPage();
				//return lp1;
				return this; //this represent --> Current class object
	}

	public LoginPage enterPassword(String pWord) {
		//enter Password
				WebElement Password=driver.findElement(By.xpath("//input[@id='password']"));
				Password.sendKeys(ConfigurationManager.configuration().getPassword());
				return this;
	}

	public WelcomePage clickLoginButton() {
		//Click Login Button
				WebElement login=driver.findElement(By.xpath("//input[@type='submit']"));
				login.click();
				//WelcomePage wp=new WelcomePage();
				//return wp;
				return new WelcomePage(driver); //wp is equalant to new WelcomePage()
	}


}
