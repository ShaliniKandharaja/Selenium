package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
		
		// Launch Chrome Browser
        // Create an Object for the ChromeDriver Class
        ChromeDriver driver = new ChromeDriver();
        
        // Load the url
        driver.get("https://www.facebook.com/");
        
        //to maximize the window
        driver.manage().window().maximize();
        
      WebElement email= driver.findElement(By.id("email"));
      email.sendKeys("testleaf.2023@gmail.com");
      
      WebElement pass=driver.findElement(By.id("pass"));
      pass.sendKeys("pass");
      
      WebElement login=driver.findElement(By.name("login"));
      login.click();
      
      driver.findElement(By.linkText("Find your account and log in.")).click();
      
      String title=driver.getTitle();
      System.out.println(title);
       

	}

}
