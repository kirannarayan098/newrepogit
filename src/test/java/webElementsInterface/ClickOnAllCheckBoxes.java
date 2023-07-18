package webElementsInterface;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickOnAllCheckBoxes {

	public static void main(String[] args) throws InterruptedException {

		// Step 1: Launch the browser
		WebDriver driver = new ChromeDriver();

		// Step 2: maximize the window
		driver.manage().window().maximize();

		// Step 3: Load the URL - Demo Vtiger App
		driver.get("http://localhost:8888");

		// Step 4: identify UserName in Demo Vtiger and provide the data
		WebElement usernameEle = driver.findElement(By.name("user_name"));
		usernameEle.sendKeys("admin");
		
		// Step 5: identify UserName in Demo Vtiger and provide the data
		WebElement passwordEle = driver.findElement(By.name("user_password"));
		passwordEle.sendKeys("manager");
		
		//Step 6: Click on Login Button
		driver.findElement(By.id("submitButton")).click();
		
		//Step 7: click on Organizations Link
		driver.findElement(By.linkText("Organizations")).click();
		
		//Step 8: Identify all the check boxes
		List<WebElement> list = driver.findElements(By.xpath("//input[@name='selected_id']"));
		
		//Step 9: navigate through the list and click on each web element
		for(WebElement element:list)
		{
			element.click();
			Thread.sleep(1000);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
