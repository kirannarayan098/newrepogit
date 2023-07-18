package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginToActitime {

	@Test
	public void loginToActiTimeTest()
	{

		// Step 1: Launch the browser
		WebDriver driver = new ChromeDriver();

		// Step 2: maximize the window
		driver.manage().window().maximize();

		// Step 3: Load the URL - Demo Vtiger App
		driver.get("https://demo.actitime.com/login.do");
		
		//Step 4: Identify the Username textField and enter username -- ID locator
		driver.findElement(By.className("textField")).sendKeys("admin");
		
		//Step 5: Identify the password textField and enter password -- Name locator
		driver.findElement(By.name("pwd")).sendKeys("manager");
		
		//Step 6: Identify the Login button and click -- ClassName locator
		driver.findElement(By.id("loginButton")).click();
		
		//driver.findElement(By.tagName("a")).click();
		
	}

}
