package week2.homeassignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//Click on CreateNewAccount
		WebElement createNewAccount=driver.findElement(By.xpath("//a[text()='Create new account']"));
		createNewAccount.click();
		
		//Give FirstName
		WebElement firstName=driver.findElement(By.name("firstname"));
		firstName.sendKeys("Shalini");
		
		//Give LastName
		WebElement lastName=driver.findElement(By.name("lastname"));
		lastName.sendKeys("K");
		
		//Enter Email
		WebElement email=driver.findElement(By.name("reg_email__"));
		email.sendKeys("shalinikandharaja@gmail.com");
		
		//Re-Enter Mail
		WebElement reEnterMail=driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']"));
		reEnterMail.sendKeys("shalinikandharaja@gmail.com");
		
		//Create New Password
		WebElement password=driver.findElement(By.id("password_step_input"));
		password.sendKeys("Shalsri");
		
		// Select BirthDayDate
		WebElement birthDayDate=driver.findElement(By.name("birthday_day"));
		Select select1=new Select(birthDayDate);
		select1.selectByIndex(3);
		
		//Select BirthDayMonth
		WebElement birthDayMonth=driver.findElement(By.name("birthday_month"));
		Select select2=new Select(birthDayMonth);
		select2.selectByVisibleText("Apr");
		
		//Select BirthDayYear
		WebElement birthDayYear=driver.findElement(By.name("birthday_year"));
		Select select3=new Select(birthDayYear);
		select3.selectByValue("2000");
		
		//Select Gender
		WebElement femaleRadioButton=driver.findElement(By.xpath("//label[text()='Female']"));
		femaleRadioButton.click();
		
		// Click on Submit Button
		WebElement submitButton=driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		submitButton.click();
		
		Thread.sleep(1000);
		
		//driver.close();
			

	}

}
