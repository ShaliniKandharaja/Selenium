package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.LoginPage;

public class RunLogin extends ProjectSpecificMethods {
	
	@BeforeTest
	public void setValue() {
		fileName="Login";

	}
	
	@Test(dataProvider = "sendData")
	public void login(String uName,String pWord) {
		System.out.println("RunLogin Test Method Driver Value: "+driver);
		LoginPage lp=new LoginPage(driver);
		lp.enterUserName(uName)
		.enterPassword(pWord)
		.clickLoginButton()
		.verifyLogin();
		
	}

}
