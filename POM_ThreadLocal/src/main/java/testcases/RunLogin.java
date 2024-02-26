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
	//We can run with TestNG also
	@Test(dataProvider = "sendData")
	public void login(String uName,String pWord) {
		
		LoginPage lp=new LoginPage();
		lp.enterUserName(uName)
		.enterPassword(pWord)
		.clickLoginButton()
		.verifyLogin();
		
	}

}
