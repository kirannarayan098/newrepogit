package javaScriptExecutorInterface;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollActions {

	public static void main(String[] args) throws InterruptedException {

		// Step 1: Launch the browser
		WebDriver driver = new ChromeDriver();

		// Step 2: maximize the window
		driver.manage().window().maximize();

		// Step 3: load the URL
		driver.get("https://www.selenium.dev/downloads/");

		// Scroll down action
		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollBy(0,1000);", "");

		Thread.sleep(3000);

		// Scroll Up Action
		js.executeScript("window.scrollBy(0,-1000);", "");

		Thread.sleep(4000);

		// Scroll right action
		js.executeScript("window.scrollBy(200,0)", "");

		Thread.sleep(3000);

		// scroll left action
		js.executeScript("window.scrollBy(-200,0)", "");

		Thread.sleep(3000);

		// Scroll until bottom of the page
		js.executeScript("window.scrollTo(0,document.body.scrollHeight);", "");

		Thread.sleep(2000);

		// Scroll back until top of the page
		js.executeScript("window.scrollTo(0,-document.body.scrollHeight);", "");

		Thread.sleep(2000);
		
		// Scroll to extreme right of the page
		js.executeScript("window.scrollTo(document.body.scrollWidth,0);", "");
		
		Thread.sleep(2000);
		
		// Scroll to extreme left top of the page
		js.executeScript("window.scrollTo(-document.body.scrollWidth,0);", "");
		
		
		
		
		
		
		}

}
