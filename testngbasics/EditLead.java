package testngbasics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class EditLead extends BaseClass {

	@Test (dependsOnMethods={"week5.homeassignments.CreateAccount.createLeadTestCase"},alwaysRun=true)
	public void EditLeadTestCase() {
		// TODO Auto-generated method stub

		//click leads link
		WebElement leads=driver.findElement(By.xpath("//a[text()='Leads']"));
		leads.click();

		//click create lead link
		WebElement createLead=driver.findElement(By.xpath("(//a[contains(text(),'Lead')])[3]"));
		createLead.click();

		//timeouts
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		//enter company name
		WebElement companyName=driver.findElement(By.xpath("(//input[contains(@name,'company')])[2]"));
		companyName.sendKeys("TestLeaf");

		//enter first name
		WebElement firstName=driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']"));
		firstName.sendKeys("Shalini");

		//enter last name
		WebElement lastName=driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']"));
		lastName.sendKeys("Kandharaja");

		//enter firstNameLocal field
		WebElement firstNameLocal=driver.findElement(By.xpath("//input[@name='firstNameLocal']"));
		firstNameLocal.sendKeys("Naganallur");

		//enter Department field
		WebElement departmentName=driver.findElement(By.name("departmentName"));
		departmentName.sendKeys("Information Technology");

		//enter description
		WebElement descriptionField=driver.findElement(By.xpath("//textarea[@name='description']"));
		descriptionField.sendKeys("Automation TEster");

		//enter Email
		WebElement email=driver.findElement(By.xpath("(//input[@name='primaryEmail'])[4]"));
		email.sendKeys("shalinikandharaja@gmail.com");



		//Select New York in State/Province Drop down
		WebElement state=driver.findElement(By.xpath("//select[@name='generalStateProvinceGeoId']"));
		Select select5=new Select(state);
		select5.selectByVisibleText("New York");

		//Click on Create Lead
		WebElement createLead1=driver.findElement(By.xpath("//input[@value='Create Lead']"));
		createLead1.click();


		//Click on Edit
		WebElement edit=driver.findElement(By.xpath("//a[text()='Edit']"));
		edit.click();

		//Clear Description
		WebElement descriptionField2=driver.findElement(By.xpath("//textarea[@name='description']"));
		descriptionField2.clear();

		//Important Note Field
		WebElement importantNote=driver.findElement(By.name("importantNote"));
		importantNote.sendKeys("Selenium with Java");

		//Click on Update
		WebElement update=driver.findElement(By.xpath("(//input[@class='smallSubmit'])[1]"));
		update.click();

		//timeouts
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		String title=driver.getTitle();
		System.out.println("Title of the page is : "+title);

		//driver.close();



	}

}
