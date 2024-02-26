package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import base.ProjectSpecificMethods;
import io.cucumber.java.en.And;

public class HomePage extends ProjectSpecificMethods {


	@And("Click on Leads link")
	public MyLeadsPage clickLeads() {
		WebElement leads=driver.findElement(By.xpath("//a[text()='Leads']"));
		leads.click();
		return new MyLeadsPage();
	}
}
