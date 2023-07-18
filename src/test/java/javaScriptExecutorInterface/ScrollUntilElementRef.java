package javaScriptExecutorInterface;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUntilElementRef {

	public static void main(String[] args) throws InterruptedException {

		// Step 1: Launch the browser
		WebDriver driver = new ChromeDriver();

		// Step 2: maximize the window
		driver.manage().window().maximize();

		// Step 3: load the URL
		driver.get("https://www.selenium.dev/downloads/");
		
		WebElement clickOn = driver.findElement(By.xpath("//img[@alt='BrowserStack']"));
		WebElement scrollUntil = driver.findElement(By.xpath("//h2[.='Selenium Level Sponsors']"));
		
		int yAxis = scrollUntil.getRect().getY();
		
		Thread.sleep(1000);
		
		// Scroll Until the element reference
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		//js.executeScript("arguments[0].scrollIntoView();", scrollUntil);
		
		js.executeScript("window.scrollBy(0,"+yAxis+");", scrollUntil);
		                 //window.scrollBy(0,655);
		
		Thread.sleep(1000);
		clickOn.click();
		
		
		
		
	}

}
