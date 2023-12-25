package week2.homeassignments;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafgroundButtonInteraction {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://leafground.com/button.xhtml");
		driver.manage().window().maximize();
		
		//click and confirm button
		WebElement clickAndConfirm=driver.findElement(By.xpath("//span[text()='Click']"));
		clickAndConfirm.click();
		String title=driver.getTitle();
		System.out.println("Webpage Title is : "+title);
		//Verify that the title of the page is ‘dashboard’
		if(title.equalsIgnoreCase("dashboard")) {
			System.out.println("Title is equal to dasboard");
		}
		
		//Navigate back
		driver.navigate().back();
		
		//timeouts
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		//Disabled button
		WebElement disabledButton=driver.findElement(By.xpath("//button[@disabled='disabled']"));
		if(disabledButton.isEnabled()) {
			System.out.println("Button is enabled");
		}
		else {
			System.out.println("Button is disabled");
		}
		
		//Get position of submit button
		WebElement submitButton=driver.findElement(By.xpath("(//span[text()='Submit'])[1]"));
		Point position=submitButton.getLocation();
		
		//Print X and Y coordinates
		System.out.println("Submit button position -X : " +position.getX());
		System.out.println("Submit button position -Y : " +position.getY());
		
		//Find Color of Save Button
		WebElement saveButton=driver.findElement(By.xpath("//span[text()='Save']"));
		String backgroundColor=saveButton.getCssValue("background-color");
		
		System.out.println("Backgroud color of save button is : "+backgroundColor);
		
		
		//Find height and Width of the Submit Button
		WebElement submitButton2=driver.findElement(By.xpath("(//span[text()='Submit'])[2]"));
		Dimension buttonSize=submitButton2.getSize();
		
		//Print the height and Width
		System.out.println("Button Height: "+buttonSize.getHeight() +"pixels" );
		System.out.println("Button Width: "+buttonSize.getWidth() +"pixels" );
		
		//driver.close();
			

	}

}
