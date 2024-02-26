package testngexcelintegration;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

public class BaseClass {
	
	public ChromeDriver driver;
	public String fileName;

	@BeforeMethod
	public void preConditions(){

		driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		//enter UserName
		WebElement userName=driver.findElement(By.xpath("//input[@id='username']"));
		userName.sendKeys("Demosalesmanager");

		//enter Password
		WebElement Password=driver.findElement(By.xpath("//input[@id='password']"));
		Password.sendKeys("crmsfa");

		//Click Login Button
		WebElement login=driver.findElement(By.xpath("//input[@type='submit']"));
		login.click();

		//Click crmsfa link
		WebElement crmsfaLink=driver.findElement(By.xpath("//a[contains(text(),'CRM')]"));
		crmsfaLink.click();


	}
	// if we are having multiple data in excel & want to use particular data only, then we can use indices attribute
	//if we want to mention many rows we can declare as @DataProvider (indices={1,2})
	
	@DataProvider(indices=1)//(name="fetchData")
	public String[][] sendData() throws IOException {
		//classname.methodname ( because readExcel method is static method, If it is not static method, 
		//we have to create object for the class and call the method and return the variable holding data
		return ReadExcelDataIntegration.readExcel(fileName); //soft coded ( gave excel name here)
	}

	@AfterMethod
	public void postConditions(){

		driver.close();

	}


}
