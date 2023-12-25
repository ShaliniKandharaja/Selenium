package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LeafTaps {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();

		// Load the url
		driver.get("http://leaftaps.com/opentaps/control/main");

		//to maximize the window
		driver.manage().window().maximize();


		//enter username
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("DemoCSR");

		//enter password
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");

		//click Login Button
		driver.findElement(By.xpath("//input[@type='submit']")).click();

		//click crmsfa link
		driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();

		//click leads link
		driver.findElement(By.xpath("//a[text()='Leads']")).click();

		//click createlead link
		driver.findElement(By.xpath("(//a[contains(text(),'Lead')])[3]")).click();

		//enter companyname
		driver.findElement(By.xpath("(//input[contains(@name,'company')])[2]")).sendKeys("TestLeaf");

		//enter firstname
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Subraja");

		//enter lastname
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("S");

		//click source dropdown
		WebElement sourceDD = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select sec = new Select(sourceDD);
		//select cold call option from source dd
		sec.selectByIndex(1);

		//click Industry dd
		WebElement industryDD = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select sec1 = new Select(industryDD);
		sec1.selectByVisibleText("Finance");

		//click Marketing campaign dd
		WebElement marketingCampaignDD = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select sec2 = new Select(marketingCampaignDD);
		sec2.selectByValue("CATRQ_ROADNTRACK");

		String title1=driver.getTitle();
		System.out.println(title1);

		//close the browser
		driver.close();


	}

}
