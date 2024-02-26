package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethods;

public class HomePage extends ProjectSpecificMethods {

	public HomePage(ChromeDriver driver) {
		this.driver=driver;
	}

	public MyLeadsPage clickLeads() {
		WebElement leads=driver.findElement(By.xpath("//a[text()='Leads']"));
		leads.click();
		return new MyLeadsPage();
	}
}
