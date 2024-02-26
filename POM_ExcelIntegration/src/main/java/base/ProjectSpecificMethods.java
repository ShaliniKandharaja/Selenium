package base;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import utils.ReadExcelDataIntegration;

public class ProjectSpecificMethods {
	
	public ChromeDriver driver;
	public String fileName;
	
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
	
	@DataProvider(indices=1)//It will run for 1st row data // indices --> to run for particular set od fata
	public String[][] sendData() throws IOException{
		return ReadExcelDataIntegration.readExcel(fileName);
		
	}

}
