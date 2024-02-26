package keyboradmouseactions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		WebElement conditionsLink = driver.findElement(By.linkText("Conditions of Use & Sale"));

		Actions builder = new Actions(driver);
        builder.scrollToElement(conditionsLink).perform();
        String text = conditionsLink.getText();
        System.out.println(text);
	}

}
