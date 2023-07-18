package waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitelyWaitPractice {

	public static void main(String[] args) {

		// Step 1: Launch the browser
		WebDriver driver = new ChromeDriver();

		// Step 2: maximize the window
		driver.manage().window().maximize();

		// Step 3: wait for 10 seconds
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Step 3: Load the URL - Demo Vtiger App
		driver.get("http://localhost:8888");

		// Step 4: identify UserName in Demo Vtiger and provide the data
		driver.findElement(By.name("user_name")).sendKeys("admin");

		// Step 5: identify UserName in Demo Vtiger and provide the data
		driver.findElement(By.name("user_password")).sendKeys("manager");

		// Step 6: Click on Login Button
		driver.findElement(By.id("submitButton")).click();
		
		//Step 7: Wait until the home page title is visible
		WebElement ele = driver.findElement(By.linkText("Organizations"));
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Organizations")));
		wait.until(ExpectedConditions.elementToBeClickable(ele));
		
		wait.until(ExpectedConditions.titleContains("Homeserrtt"));
		
		System.out.println("Title contains Home");
		
		
		
		

	}

}
