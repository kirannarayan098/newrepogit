package autoSuggestions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchDealsWithDiscountAmazon {

	public static void main(String[] args) throws InterruptedException {

		// Step 1: Launch the browser
		WebDriver driver = new ChromeDriver();

		// Step 2: maximize the window
		driver.manage().window().maximize();

		// Step 3: Navigate to Flipkart.com
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);

		// Step 4: click on todays deals link
		driver.findElement(By.linkText("Today's Deals")).click();
		Thread.sleep(1000);
		
		//Step 5: Click on electronics 
		driver.findElement(By.xpath("//span[.='Electronics']")).click();
		Thread.sleep(1000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500);", "");
		Thread.sleep(1000);

		// Step 5: capture all the products
		List<WebElement> list = driver.findElements(By.xpath("//div[@class='BadgeAutomatedLabel-module__badgeAutomatedLabel_2Teem9LTaUlj6gBh5R45wd']"));
		for (WebElement ele : list) 
		{
			System.out.println(ele.getDomProperty("innerText"));
		}
	}

}
