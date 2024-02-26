package seleniumlocators;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertInteractions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/alert.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		WebElement promptAlert=driver.findElement(By.xpath("(//span[text()='Show'])[5]"));
		promptAlert.click();
		
		Alert prompt=driver.switchTo().alert();
		Thread.sleep(3000);
		
		prompt.sendKeys("Shalini");
		Thread.sleep(3000);
		prompt.dismiss();
		
		//Verify Text
		WebElement Text=driver.findElement(By.xpath("//span[text()='User cancelled the prompt.']"));
		String VerificationText=Text.getText();
		if(VerificationText.contains("cancelled")) {
			System.out.println("Prompt Cancelled");
			
		}
		else {
			System.out.println("Prompt not cancelled");
		}
		
		

	}

}
