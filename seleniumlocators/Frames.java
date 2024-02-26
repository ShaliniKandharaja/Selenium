package seleniumlocators;


import java.time.Duration;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
	
	
	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		//iframe[@id='iframeResult']
		//Switch to frame
		WebElement frame=driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
		driver.switchTo().frame(frame);
		// Click Try button
		//button[text()='Try it']
		WebElement tryButton=driver.findElement(By.xpath("//button[text()='Try it']"));
		tryButton.click();
		//Switch to Alert
		Alert alert=driver.switchTo().alert();
		alert.accept();
		//Verify Text
		WebElement verifyText=driver.findElement(By.xpath("//p[@id='demo']"));
		String text = verifyText.getText();
		if(text.contains("Hello")) {
			System.out.println("Expected message displayed");
		}



 
 
	}

}
