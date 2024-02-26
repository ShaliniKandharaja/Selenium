package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.LoginPage;

public class RunCreateLead extends ProjectSpecificMethods{

	@BeforeTest
	public void setValue() {
		fileName="CreateLead";

	}

	@Test(dataProvider = "sendData")
	public void runTestCases(String uName,String pWord,String cName,String fName,String lName) {
		System.out.println("RunCreateLead Test Method Driver Value"+driver);
		LoginPage lp=new LoginPage(); // Method Chaining
		lp.enterUserName(uName)
		.enterPassword(pWord)
		.clickLoginButton()
		.verifyLogin()
		.clickCRMSFALink()
		.clickLeads() 
		.clickCreateLead()
		.firstName(fName)
		.lastName(lName)
		.companyName(cName)
		.clickCreateLeadButton()
		.getpageTitle(); 




		// LoginPage lp1=new LoginPage();
		//lp.enterUserName();
		//lp.enterPassword();
		//lp.clickLoginButton();


		//Welcome wp1=new WelcomePage();
		//wp1.verifyLogin();
		//wp1.clickCRMSFALink();




	}

}
