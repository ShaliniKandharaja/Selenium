package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethods;
import config.ConfigurationManager;

public class HomePage extends ProjectSpecificMethods {

	public HomePage(ChromeDriver driver) {
		this.driver=driver;
	}

	public MyLeadsPage clickLeads() {
		WebElement leads=driver.findElement(By.linkText(ConfigurationManager.configuration().getLeadsLink()));
		leads.click();
		return new MyLeadsPage(driver);
	}
}
