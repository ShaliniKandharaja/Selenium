package week5.homeassignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class CreateAccount extends BaseClass {

	@Test
	public void CreateLeadTestCase() throws InterruptedException {

		
		//Click on Accounts
		WebElement accounts=driver.findElement(By.xpath("//a[text()='Accounts']"));
		accounts.click();

		//Click on Create Account
		WebElement createAccount=driver.findElement(By.xpath("//a[text()='Create Account']"));
		createAccount.click();
		
		//Enter Account Name
		WebElement accountName=driver.findElement(By.xpath("//input[@id='accountName']"));
		accountName.sendKeys("Praba13");
		
		// Select ComputerSoftware in Industry Drop down
		WebElement industryDropDown=driver.findElement(By.name("industryEnumId"));
		Select select1=new Select(industryDropDown);
		select1.selectByIndex(3);
		
		// Give description as Selenium Automation Tester
		WebElement description=driver.findElement(By.xpath("//textarea[@name='description']"));
		description.sendKeys("Selenium Automation Tester");
		
		// Select S-Corporation in Ownership Drop down
		WebElement ownershipDropDown=driver.findElement(By.name("ownershipEnumId"));
		Select select2=new Select(ownershipDropDown);
		select2.selectByVisibleText("S-Corporation");
		
		// Select Employee in Source Drop down
		WebElement sourceDropDown=driver.findElement(By.id("dataSourceId"));
		Select select3=new Select(sourceDropDown);
		select3.selectByValue("LEAD_EMPLOYEE");
		
		//Select eCommerce Site Internal Campaign in MarketingCampaign Drop down
		WebElement marketingCampaign=driver.findElement(By.id("marketingCampaignId"));
		Select select4=new Select(marketingCampaign);
		select4.selectByIndex(6);
		
		//Select Texas in State/Province Drop down
		WebElement state=driver.findElement(By.xpath("//select[@name='generalStateProvinceGeoId']"));
		Select select5=new Select(state);
		select5.selectByValue("TX");
		
		//Click on Create Account button
		WebElement createAccountButton=driver.findElement(By.xpath("//input[@value='Create Account']"));
		createAccountButton.click();
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Thread.sleep(5000);
		
		//Verify Account Name displayed correctly
		WebElement verifyAccountName=driver.findElement(By.xpath("(//span[@class='tabletext'])[3]"));
		String displayedAccountName=verifyAccountName.getText();
		System.out.println(displayedAccountName);
		
	
		

	}

}
