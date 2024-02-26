package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import base.ProjectSpecificMethods;
import io.cucumber.java.en.And;

public class MyLeadsPage extends ProjectSpecificMethods {
	
	@And("Click on Create Lead Link")
	public CreateLeadPage clickCreateLead() {
		
		WebElement createLead=driver.findElement(By.xpath("(//a[contains(text(),'Lead')])[3]"));
		createLead.click();
		return new CreateLeadPage();
		
		

}
	
}
