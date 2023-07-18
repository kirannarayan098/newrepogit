package autoSuggestions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchAndCaptureBluetoothAmazon {

	public static void main(String[] args) throws InterruptedException {

		// Step 1: Launch the browser
		WebDriver driver = new ChromeDriver();

		// Step 2: maximize the window
		driver.manage().window().maximize();

		// Step 3: Navigate to Flipkart.com
		driver.get("https://www.amazon.com/");
		Thread.sleep(2000);

		//Step 4: search for bluetooth earphones
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("bluetooth earphones boult");
		driver.findElement(By.id("nav-search-submit-button")).submit();
		
		//Step 5: capture all the bluetooth belonging to boult
		Thread.sleep(2000);
		List<WebElement> list = driver.findElements(By.xpath("//span[contains(text(),'Boult ')]"));
		for(WebElement ele:list)
		{
			System.out.println(ele.getText());
		}
		
	}

}
