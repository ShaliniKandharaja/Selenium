package javaopps;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OnePlus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https:www.amazon.in");
		

		WebElement searchBar=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		searchBar.sendKeys("OnePlus Mobiles",Keys.ENTER);
		
		 List<WebElement> allPrices = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
	        
	        for (WebElement each : allPrices) {
	            String text = each.getText();
	            System.out.println(text);

	}
		
	}

}
