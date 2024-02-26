package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethods;

public class LoginPage extends ProjectSpecificMethods{
	
	public LoginPage(ChromeDriver driver) {  //Default constructor explicitly mentioned to get driver value
		this.driver=driver;
	}

	public LoginPage enterUserName() {
		//enter UserName
				WebElement userName=driver.findElement(By.xpath("//input[@id='username']"));
				userName.sendKeys("Demosalesmanager");
				;// Going to stay in same page
				// LoginPage lp1=new LoginPage();
				//return lp1;
				return this; //this represent --> Current class object
	}

	public LoginPage enterPassword() {
		//enter Password
				WebElement Password=driver.findElement(By.xpath("//input[@id='password']"));
				Password.sendKeys("crmsfa");
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
