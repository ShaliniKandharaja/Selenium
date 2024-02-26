package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import base.ProjectSpecificMethods;

public class MyLeadsPage extends ProjectSpecificMethods {
	
	public CreateLeadPage clickCreateLead() {
		
		WebElement createLead=driver.findElement(By.xpath("(//a[contains(text(),'Lead')])[3]"));
		createLead.click();
		return new CreateLeadPage();
		
		

}
	
}
