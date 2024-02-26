package seleniumlocators;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnSimpleAlert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/alert.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//span[text()='Show']")).click();
		//switch the driver focus to the alert
		Alert simpleAlert = driver.switchTo().alert();
		//read the alert message
		String text = simpleAlert.getText();
		//print the alert message
		System.out.println("Alert Message is : "+text);
		//accept the alert
		//simpleAlert.accept();
		//verify and validate 
		String text2 = driver.findElement(By.id("simple_result")).getText();
		if (text2.contains("success")) {
			System.out.println("Alert is handled successfully");
		}
	}

}
