package autoSuggestions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class SearchAndCaptureLapTopsAmazon {

	public static void main(String[] args) throws InterruptedException {

		// Step 1: Launch the browser
		WebDriver driver = new ChromeDriver();

		// Step 2: maximize the window
		driver.manage().window().maximize();

		// Step 3: Navigate to Flipkart.com
		driver.get("https://www.amazon.com/");
		Thread.sleep(2000);

		// Step 4: search for bluetooth earphones
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("laptop",Keys.ENTER);
		//driver.findElement(By.id("nav-search-submit-button")).click();

		// Step 5: capture all the bluetooth belonging to boult
		Thread.sleep(2000);
		List<WebElement> list = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
		
		for (WebElement ele : list) 
		{
			String laptopName = ele.getText();
			if(laptopName.contains("HP"))
			{
				System.out.println(ele.getText());
				ele.click();
				break;
			}
		}
		
		
	}

}
