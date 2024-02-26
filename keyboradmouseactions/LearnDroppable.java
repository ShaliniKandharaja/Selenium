package keyboradmouseactions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnDroppable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.switchTo().frame(0);
		WebElement eleDrag = driver.findElement(By.id("draggable"));
		WebElement eleDrop = driver.findElement(By.id("droppable"));
		Actions act = new Actions(driver);
		act.dragAndDrop(eleDrag, eleDrop).perform();

	}

}
