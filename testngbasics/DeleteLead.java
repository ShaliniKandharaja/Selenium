package testngbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class DeleteLead extends BaseClass {

	@Test
	public void DeleteLeadTestcase() throws InterruptedException {

		//click leads link
		WebElement leads=driver.findElement(By.xpath("//a[text()='Leads']"));
		leads.click();

		//Click on Find Leads
		WebElement findLeads=driver.findElement(By.xpath("//a[text()='Find Leads']"));
		findLeads.click();
		
		Thread.sleep(5000);
		
		//Click on Phone tab
		WebElement phone=driver.findElement(By.xpath("//ul[@class='x-tab-strip x-tab-strip-top']/li[2]"));
		phone.click();
		
		//Enter Area code for phone number
		WebElement areaCode=driver.findElement(By.xpath("//input[@name='phoneCountryCode']"));
		areaCode.clear();
		areaCode.sendKeys("+91");
		
		//Enter phone number
		WebElement phoneNumber=driver.findElement(By.xpath("//input[@name='phoneNumber']"));
		phoneNumber.sendKeys("8056556347");
		
		//Click on Find Leads
		WebElement findLeadsButton=driver.findElement(By.xpath("//button[text()='Find Leads']"));
		findLeadsButton.click();
		
		Thread.sleep(3000);
		
		//Capture Lead ID of first result
		WebElement leadID=driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']"));
		String leadIDCaptured=leadID.getText();
		System.out.println("LeadID Captured is :"+ leadIDCaptured);
		
		//Click on Lead ID
		WebElement leadID1=driver.findElement(By.xpath("(//a[@class='linktext'])[4]"));
		leadID1.click();
		
		Thread.sleep(2000);
		
		//Click on Delete
		WebElement deleteButton=driver.findElement(By.linkText("Delete"));
		deleteButton.click();
		
		//Click on Find Leads
		WebElement findLeads2=driver.findElement(By.linkText("Find Leads"));
		findLeads2.click();
		
		//Enter Lead ID
		WebElement leadIDTextBox=driver.findElement(By.xpath("//input[@name='id']"));
		leadIDTextBox.sendKeys(leadIDCaptured);
		
		Thread.sleep(2000); 
		
		//Click on Find Leads
		WebElement findLeadsButton1=driver.findElement(By.xpath("//button[text()='Find Leads']"));
		findLeadsButton1.click();
		
		//Verify "No records to display"
		WebElement noRecords=driver.findElement(By.xpath("//div[text()='No records to display']"));
		String displayedMSG=noRecords.getText();
		
		String ExpectedMSG="No records to display";
		
		if(displayedMSG.equals(ExpectedMSG)) {
			System.out.println("Expected message displayed as : "+displayedMSG);
		}
		
		else {
			System.out.println("Expected message not displayed");
		}
		
		
		
		//driver.close();

	}

}
