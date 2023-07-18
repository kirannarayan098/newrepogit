package javaScriptExecutorInterface;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleDisabledElements {

	public static void main(String[] args) throws InterruptedException {

		// Step 1: Launch the browser
		WebDriver driver = new ChromeDriver();

		// Step 2: maximize the window
		driver.manage().window().maximize();

		// Step 3: load the URL
		driver.get("https://demoapp.skillrary.com/");
		
		//Identify the disabled elemnt
		WebElement disabledTextField = driver.findElement(By.xpath("//input[@class='form-control']"));

		//Enter data into disabled text field using JSE
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		Thread.sleep(1000);
		
		js.executeScript("arguments[0].value='QSPIDERS'", disabledTextField);
		//js.executeScript("arguments[0].click()", disabledTextField);
		
		
	}

}
