package pages;

import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethods;

public class ViewLeadPage extends ProjectSpecificMethods {
	
	public ViewLeadPage(ChromeDriver driver) {
		this.driver=driver;
	}

	public ViewLeadPage getpageTitle() {
		String title=driver.getTitle();
		System.out.println("Title of the page is :"+title);
		return this;

	}

}
