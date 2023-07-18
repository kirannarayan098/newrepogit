package webElementsInterface;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckCheckBoxesActiTime {

	public static void main(String[] args) throws InterruptedException {

		// Step 1: Launch the browser
		WebDriver driver = new ChromeDriver();

		// Step 2: maximize the window
		driver.manage().window().maximize();

		// Step 3: Load the URL - Demo Vtiger App
		driver.get("https://demo.actitime.com/login.do");

		// Step 4: Identify the Username textField and enter username 
		driver.findElement(By.className("textField")).sendKeys("admin");

		// Step 5: Identify the password textField and enter password 
		driver.findElement(By.name("pwd")).sendKeys("manager");

		// Step 6: Identify the Login button and click 
		driver.findElement(By.id("loginButton")).click();
		
		//Step 7: Click on Tasks
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='container_tasks']")).click();
		
		//Step 8: Click on all check boxes
		Thread.sleep(2000);
		List<WebElement> list = driver.findElements(By.xpath("//div[@class='img']"));
		for(WebElement ele:list)
		{
			ele.click();
			Thread.sleep(1000);
		}

	}

}
