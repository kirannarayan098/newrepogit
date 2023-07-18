package autoSuggestions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchAndCapturePhonesAmazon {

	public static void main(String[] args) throws InterruptedException, AWTException {

		// Step 1: Launch the browser
		WebDriver driver = new ChromeDriver();

		// Step 2: maximize the window
		driver.manage().window().maximize();
		
		//Step 3: Navigate to Flipkart.com
		driver.get("https://www.amazon.com/");
		Thread.sleep(2000);
		
		//Step 4: search for redMi phones
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("redmi");
		driver.findElement(By.id("nav-search-submit-button")).submit();
		
		//Step 5: capture all the phones 
		List<WebElement> lists=driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']")); 
		for(WebElement element1:lists) 
		{ 
			String value=element1.getText(); 
			System.out.println(value); 
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
