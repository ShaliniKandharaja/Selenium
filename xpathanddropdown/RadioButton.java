package xpathanddropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) throws InterruptedException {
		
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/radio.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		//Select Most favorite browser
		WebElement chromeRadioButton=driver.findElement(By.xpath("(//label[text()='Chrome'])[1]"));
		chromeRadioButton.click();
		
		//Verify Unselectable
		WebElement chennaiRadioButton=driver.findElement(By.xpath("//label[text()='Chennai']"));
		chennaiRadioButton.click();
		chennaiRadioButton.click();
		
		if(chennaiRadioButton.isSelected()) {
			System.out.println("Chennai Radio Button has Selected");
		}
		else {
			System.out.println("Chennai Radio Button has not Selected");
		}
		
		Thread.sleep(5000);
		
		//Find the default Radio Button which has selected already
		WebElement chromeRadio=driver.findElement(By.xpath("//table[@id='j_idt87:console2']/tbody[1]/tr[1]/td[1]/div[1]/div[2]/span[1]"));
		WebElement fireFoxRadio=driver.findElement(By.xpath("//*[@id='j_idt87:console2']/tbody/tr/td[2]/div/div[2]/span"));
		WebElement safariFoxRadio=driver.findElement(By.xpath("(//div[@class='ui-radiobutton ui-widget'])[21]"));
		WebElement edgeFoxRadio=driver.findElement(By.xpath("//*[@id='j_idt87:console2']/tbody/tr/td[4]/div/div[2]/span"));
		
		if(chromeRadio.isSelected()) {
			System.out.println("The default Radio Button is Chrome");
		}
		else if(fireFoxRadio.isSelected()) {
			System.out.println("The default Radio Button is FireFox");
		}
		else if(safariFoxRadio.isSelected()) {
			System.out.println("The default Radio Button is Safari");
		}
		else if(edgeFoxRadio.isSelected()) {
			System.out.println("The default Radio Button is Edge");
		}
		else {
			System.out.println("No default Radio Button");
		}
		
		
		//Check and select the age group (21-40 Years) if not already selected
		WebElement ageRadioButton=driver.findElement(By.xpath("//*[@id='j_idt87:age']/div/div[2]/div/div[2]"));
		
		if(ageRadioButton.isSelected()) {
			
			System.out.println("Radio button is already selected");
		}
		else {
			System.out.println("Radio Button is not already selected");
		}
		
		
		
		
	}

}
