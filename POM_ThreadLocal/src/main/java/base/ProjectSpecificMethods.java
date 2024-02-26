package base;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import utils.ReadExcelDataIntegration;

public class ProjectSpecificMethods extends AbstractTestNGCucumberTests {

	//public static ChromeDriver driver;
	//private static final ThreadLocal<ChromeDriver>  cDriver=new ThreadLocal<ChromeDriver>();
	private static final ThreadLocal<RemoteWebDriver>  cDriver=new ThreadLocal<RemoteWebDriver>();
	public String fileName;
	
	public void setDriver(String browser) {
		if (browser.equalsIgnoreCase("chrome")) {
			cDriver.set(new ChromeDriver());
		}
		else if (browser.equalsIgnoreCase("edge")) {
			cDriver.set(new EdgeDriver());
		}
		else if (browser.equalsIgnoreCase("firefox")) {
			cDriver.set(new FirefoxDriver());
		}
	
	}

//	public void setDriver() {
//		cDriver.set(new ChromeDriver());
//	}

	public RemoteWebDriver getDriver() {
		//ChromeDriver chromeDriver=cDriver.get();
		//return chromeDriver;
		return cDriver.get();


	}

	@Parameters("browser")
	@BeforeMethod
	public void preConditions(String browser ){
		setDriver(browser);  // Initialized ChromeDriver in setDriver()
		//driver=new ChromeDriver();
		getDriver().get("http://leaftaps.com/opentaps/");  // driver value replaced with getDriver()
		getDriver().manage().window().maximize();
		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}

	@AfterMethod
	public void postConditions(){
		getDriver().close();

	}

	@DataProvider(parallel=true)// Data provider will run in parallel
	//(indices=1)//It will run for 1st row data // indices --> to run for particular set od fata
	public String[][] sendData() throws IOException{
		return ReadExcelDataIntegration.readExcel(fileName);

	}

}
