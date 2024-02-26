package testcases;

import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.LoginPage;

public class RunCreateLead extends ProjectSpecificMethods{
	
	@Test
	public void runTestCases() {
		System.out.println("RunCreateLead Test Method Driver Value"+driver);
		LoginPage lp=new LoginPage(driver); // Method Chaining
		lp.enterUserName()
		.enterPassword()
		.clickLoginButton()
		.verifyLogin()
		.clickCRMSFALink();
		
	/*	.clickLeads() 
		.clickCreateLead()
		.firstName()
		.lastName()
		.companyName()
		.clickCreateLeadButton()
		.getpageTitle();    */
	
		
		
		
		// LoginPage lp1=new LoginPage();
		//lp.enterUserName();
		//lp.enterPassword();
		//lp.clickLoginButton();
		
		
		//Welcome wp1=new WelcomePage();
		//wp1.verifyLogin();
		//wp1.clickCRMSFALink();
		
		
		
		
	}

}
