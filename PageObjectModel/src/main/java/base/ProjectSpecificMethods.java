package base;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class ProjectSpecificMethods {
	
	public ChromeDriver driver;
	
	@BeforeMethod
	public void preConditions(){

		driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}
	

	@AfterMethod
	public void postConditions(){

		driver.close();

	}

}
