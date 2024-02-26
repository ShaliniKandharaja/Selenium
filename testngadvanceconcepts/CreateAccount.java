package testngadvanceconcepts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CreateAccount {
	
	public RemoteWebDriver driver;
	//RemoteWebDriver is parent for all the browsers
	//public ChromiumDriver driver;
	//public ChromeDriver driver;
	//ChromeDriver is only parent of Chrome, that's why getting error in Edge Driver
	//ChromiumDriver is parent of both Chrome and Edge Driver
	
	
	@DataProvider//(name="fetchData")
	public String[][] sendData() {
		                        //RowCount ColumnCount
		String data[][]=new String[2][4];
		
		//1st Set of Data
		data[0][0]="Testleaf";
		data[0][1]="Raja";
		data[0][2]="D";
		data[0][3]="91";
		
		//2nd Set of Data
		data[1][0]="Qeagle";
		data[1][1]="Ramesh";
		data[1][2]="D";
		data[1][3]="99";
		
		return data;
		
		
	}

	@Parameters({"browser","url","username","password"})

	@Test (dataProvider="sendData")  //we can use method name or else we can use @DataProvide name //(enabled=false)
	public  void createLead(String browser,String url,String uName,String password,String cName,
			String fName,String lName,String pNo) {

		if(browser.equalsIgnoreCase("chrome")) {
			driver=new ChromeDriver();	
		}
		else if(browser.equalsIgnoreCase("edge")) {
			driver=new EdgeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox")) {
			driver=new FirefoxDriver();
		}

		
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		//enter UserName
		WebElement userName=driver.findElement(By.xpath("//input[@id='username']"));
		userName.sendKeys(uName);

		//enter Password
		WebElement Password=driver.findElement(By.xpath("//input[@id='password']"));
		Password.sendKeys(password);

		//Click Login Button
		WebElement login=driver.findElement(By.xpath("//input[@type='submit']"));
		login.click();

		//Click crmsfa link
		WebElement crmsfaLink=driver.findElement(By.xpath("//a[contains(text(),'CRM')]"));
		crmsfaLink.click();

		//Click on Accounts
		WebElement accounts=driver.findElement(By.xpath("//a[text()='Accounts']"));
		accounts.click();

		//Click on Create Account
		WebElement createAccount=driver.findElement(By.xpath("//a[text()='Create Account']"));
		createAccount.click();

		//Enter Account Name
		WebElement accountName=driver.findElement(By.xpath("//input[@id='accountName']"));
		accountName.sendKeys(fName);

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
		//Thread.sleep(5000);

		//Verify Account Name displayed correctly
		WebElement verifyAccountName=driver.findElement(By.xpath("(//span[@class='tabletext'])[3]"));
		String displayedAccountName=verifyAccountName.getText();
		System.out.println(displayedAccountName);


		driver.close();

	}

}
