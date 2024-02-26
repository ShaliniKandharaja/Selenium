package testcases;

import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.LoginPage;

public class RunLogin extends ProjectSpecificMethods {
	
	@Test
	public void login() {
		System.out.println("RunLogin Test Method Driver Value: "+driver);
		LoginPage lp=new LoginPage(driver);
		lp.enterUserName()
		.enterPassword()
		.clickLoginButton()
		.verifyLogin();
		
	}

}
