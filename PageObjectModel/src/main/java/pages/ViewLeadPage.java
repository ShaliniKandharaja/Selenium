package pages;

import base.ProjectSpecificMethods;

public class ViewLeadPage extends ProjectSpecificMethods {
	
	public ViewLeadPage getpageTitle() {
		String title=driver.getTitle();
		System.out.println("Title of the page is :"+title);
		return this;

	}

}
