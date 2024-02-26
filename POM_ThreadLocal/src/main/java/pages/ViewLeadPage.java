package pages;

import base.ProjectSpecificMethods;
import io.cucumber.java.en.Then;

public class ViewLeadPage extends ProjectSpecificMethods {
	
	@Then("ViewLeadPage should be displayed")
	public ViewLeadPage getpageTitle() {
		String title=getDriver().getTitle();
		System.out.println("Title of the page is :"+title);
		return this;

	}

}
