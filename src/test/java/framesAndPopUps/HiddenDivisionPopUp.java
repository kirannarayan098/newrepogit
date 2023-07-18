package framesAndPopUps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDivisionPopUp {

	public static void main(String[] args) throws Throwable {

		// Step 1: Launch the browser
		WebDriver driver = new ChromeDriver();

		// Step 2: maximize the window
		driver.manage().window().maximize();

		// Step 3: Load the URL - Demo Vtiger App
		driver.get("https://demo.actitime.com/login.do");

		// Step 4: Identify the Username textField and enter username -- ID locator
		driver.findElement(By.className("textField")).sendKeys("admin");

		// Step 5: Identify the password textField and enter password -- Name locator
		driver.findElement(By.name("pwd")).sendKeys("manager");

		// Step 6: Identify the Login button and click -- ClassName locator
		driver.findElement(By.id("loginButton")).click();
		
		Thread.sleep(1000);
		
		//Step 7: navigate to tasks
		driver.findElement(By.id("container_tasks")).click();
		
		//Step 8: check the check box
        driver.findElement(By.xpath("(//div[@class='img'])[2]")).click();
		
		Thread.sleep(1000);
		
		//Step 9: click on delete
		driver.findElement(By.xpath("(//div[.='Copy to'])[1]")).click();
		
		Thread.sleep(2000);
		
		//Handle the hidden division pop up
		driver.findElement(By.xpath("(//div[.='Copy']/following-sibling::div[.='Cancel'])[3]")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
