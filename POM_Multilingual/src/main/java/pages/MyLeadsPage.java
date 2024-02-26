package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethods;
import config.ConfigurationManager;

public class MyLeadsPage extends ProjectSpecificMethods {
	
	public MyLeadsPage(ChromeDriver driver) {
		this.driver=driver;
	}

	

	public CreateLeadPage clickCreateLead() {
		
		WebElement createLead=driver.findElement(By.partialLinkText(ConfigurationManager.configuration().getCreateLeadLink()));
		createLead.click();
		return new CreateLeadPage(driver);
		
		

}
	
}
