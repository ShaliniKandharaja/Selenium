package week5.homeassignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseClass {

	public ChromeDriver driver;

	@BeforeSuite
	public void startReport() {
		System.out.println("Report Started");
	}

	@BeforeTest
	public void setValues(){
		System.out.println("Values are set");

	}

	@BeforeClass
	public void assignTestCaseDetails(){
		System.out.println("Test case details are assigned");
	}


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

	@AfterMethod
	public void postConditions(){

		driver.close();

	}


	@AfterSuite
	public void stopReport(){
		System.out.println("Report stoped and Saved");

	}





}
