package javaScriptExecutorInterface;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginToVtigerUsingJSE {

	public static void main(String[] args) throws InterruptedException {

		// Step 1: Launch the browser
		WebDriver driver = new ChromeDriver();

		// Step 2: maximize the window
		driver.manage().window().maximize();

		// Step 3: load the URL
		driver.get("http://localhost:8888");
		
		//identify the elements
		WebElement un = driver.findElement(By.name("user_name"));
		WebElement pwd = driver.findElement(By.name("user_password"));
		WebElement submitBtn = driver.findElement(By.id("submitButton"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("arguments[0].value='admin'", un);
		js.executeScript("arguments[0].value='manager'", pwd);
		js.executeScript("arguments[0].click()", submitBtn);
		
		Thread.sleep(2000);
		
		//get the title of the page
		String title = js.executeScript("return document.title", "").toString();
		System.out.println(title);
		

	}

}
