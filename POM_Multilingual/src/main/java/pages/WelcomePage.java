package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethods;
import config.ConfigurationManager;

public class WelcomePage extends ProjectSpecificMethods {
	
	public WelcomePage(ChromeDriver driver) {
		this.driver=driver;
	}

	public WelcomePage verifyLogin() {
		
		String text=driver.findElement(By.tagName("h2")).getText();
		if(text.contains(ConfigurationManager.configuration().getVerifyLogin())) {
			System.out.println("Logged in successfully");
		}
		else {
			System.out.println("Login is not successfull");
		}
		return this;
		
	}
	
	public HomePage clickCRMSFALink() {
		
		//Click crmsfa link
				WebElement crmsfaLink=driver.findElement(By.xpath("//a[contains(text(),'CRM')]"));
				crmsfaLink.click();
				return new HomePage(driver);

	}

}
