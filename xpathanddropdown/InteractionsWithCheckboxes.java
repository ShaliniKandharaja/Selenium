package xpathanddropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class InteractionsWithCheckboxes {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver=new ChromeDriver();
		driver.get("https://leafground.com/checkbox.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		//Click on Basic Checkbox
		WebElement basic=driver.findElement(By.xpath("//span[text()='Basic']"));
		basic.click();

		//Click on Ajax Checkbox
		WebElement Ajax=driver.findElement(By.xpath("//span[text()='Ajax']"));
		Ajax.click();

		//Locate the element containing expected message
		WebElement message=driver.findElement(By.xpath("//span[text()='Checked']"));

		//Get the displayed message
		String displayedMessage=message.getText();

		//Specify the expected message
		String expectedMessage="Checked";

		if(displayedMessage.equals(expectedMessage)) {
			System.out.println("Expected message is displayed as : "+displayedMessage);
		}
		else {
			System.out.println("Expected message is not displayed");
		}

		//Choose Java in favorite language
		WebElement java=driver.findElement(By.xpath("//label[text()='Java']"));
		java.click();

		//Click on Tri State Checkbox
		WebElement triState=driver.findElement(By.xpath("//span[@class='ui-chkbox-icon ui-c ']/parent::div"));
		triState.click();

		//Locate the element containing expected message
		WebElement triMessage=driver.findElement(By.xpath("//span[text()='State has been changed.']"));

		//Get the displayed message  
		String triDisplayedMSG=triMessage.getText();

		String triExpectedMSG="State has been changed.";

		//Verify the displayed message for Tri Check box
		if(triDisplayedMSG.equals(triExpectedMSG)) {
			System.out.println("Expected message is displayed as : "+triDisplayedMSG);
		}
		else {
			System.out.println("Expected message is not displayed");
		}

		// Click on Toggle Switch Slider
		WebElement toggle=driver.findElement(By.xpath("//div[@class='ui-toggleswitch-slider']"));
		toggle.click();

		//Locate the element containing expected message
		WebElement toggleMessage=driver.findElement(By.xpath("//span[text()='Checked']"));

		//Get the displayed message  
		String toggleDisplayedMSG=toggleMessage.getText();

		//Expected Message
		String toggleExpectedMSG="Checked";

		//Verify the displayed message for Tri Check box
		if(toggleDisplayedMSG.equals(toggleExpectedMSG)) {
			System.out.println("Expected message is displayed as : "+toggleDisplayedMSG);
		}
		else {
			System.out.println("Expected message is not displayed");
		}


		//Locate disabled Check box
		WebElement disabledCheckBox=driver.findElement(By.xpath("//input[@disabled='disabled']"));

		//Verify the check box is disabled
		if(disabledCheckBox.isEnabled()) {
			System.out.println("Check box is enabled");
		}

		else {
			System.out.println("Check box is disabled");
		}

		//Identify the Drop down element
		WebElement dropDown=driver.findElement(By.xpath("(//div[contains(@id,'multiple')])[1]"));
		dropDown.click();

		Thread.sleep(500);

		// Click on Miami
		WebElement miami=driver.findElement(By.xpath("(//label[text()='Miami'])[2]"));
		miami.click();

		Thread.sleep(500);

		//Click on London
		WebElement london=driver.findElement(By.xpath("(//label[text()='London'])[2]"));
		london.click();

		Thread.sleep(500);

		// Click on Paris
		WebElement paris=driver.findElement(By.xpath("(//label[text()='Paris'])[2]"));
		paris.click();

		//Again click on the  Drop down element
		WebElement dropDown1=driver.findElement(By.xpath("(//div[contains(@id,'multiple')])[1]"));
		dropDown1.click();

		//driver.close();

	}

}
