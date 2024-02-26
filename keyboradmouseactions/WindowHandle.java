package keyboradmouseactions;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.irctc.co.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		//get the window handle
		String pWindowHandle = driver.getWindowHandle();
		System.out.println("Parent window handle is : "+pWindowHandle);

		// Click on Flights link
		WebElement flightsLink=driver.findElement(By.linkText("FLIGHTS"));
		flightsLink.click();

		//to get all the Window handles
		Set<String> windowHandles = driver.getWindowHandles();//pWindowHandle,childWindowHandle
		//Convert Set to List
		List<String> handles = new ArrayList<String>(windowHandles);
		driver.switchTo().window(handles.get(1));

		//get the title of the childWindow
		String cTitle = driver.getTitle();
		System.out.println(cTitle);

		//switch to parent window
		driver.switchTo().window(pWindowHandle);
		
		//close the parent window
		driver.close();

	}

}
