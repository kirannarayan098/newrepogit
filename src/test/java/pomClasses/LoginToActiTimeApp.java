package pomClasses;

import static org.testng.Assert.assertTrue;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginToActiTimeApp {

	@Test
	public void loginTest() throws Throwable
	{

		// Step 1: Launch the browser
		WebDriver driver = new ChromeDriver();

		// Step 2: maximize the window
		driver.manage().window().maximize();
		
		//Step 3: use implicitely wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Step 3: Load the URL - Demo Vtiger App
		driver.get("https://demo.actitime.com/login.do");
		

//		// Step 4: Identify the Username textField and enter username -- ID locator
//		driver.findElement(By.className("textField")).sendKeys("admin");
//
//		// Step 5: Identify the password textField and enter password -- Name locator
//		driver.findElement(By.name("pwd")).sendKeys("manager");
//
//		// Step 6: Identify the Login button and click -- ClassName locator
//		driver.findElement(By.id("loginButton")).click();
		
		
		//Read username and password from Property File
		FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\Data.properties");
		Properties p = new Properties();
		p.load(fis);
		String USERNAME = p.getProperty("username");
		String PASSWORD = p.getProperty("password");
		
		//Login To App Using POM CLASS
		LoginPage lp = new LoginPage(driver);
		
//		lp.getUserNameEdt().sendKeys(USERNAME);
//		lp.getPasswordEdt().sendKeys(PASSWORD);
//		lp.getLoginLnk().click();
		
//		lp.loginToApp("admin", "manager");
		
		lp.loginToApp(USERNAME, PASSWORD);
		

		System.out.println("Login successful");
		
		//Validate for Title
		
		String ExpTitle = "actiTIME -  Enter Time-Track";
		Thread.sleep(2000);
		String actTitle = driver.getTitle();
		
		//Assert.assertEquals(actTitle, ExpTitle); // double argument
		
		Assert.assertTrue(actTitle.contains("actiTIME")); // single argument
		
		System.out.println("assert passed");
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
