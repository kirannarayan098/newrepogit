package waits;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitelyWaitPractice {

	public static void main(String[] args) {

		// Step 1: Launch the browser
		WebDriver driver = new ChromeDriver();

		// Step 2: maximize the window
		driver.manage().window().maximize();
		
		//Step 3: wait for 10 seconds
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Step 3: Load the URL - Demo Vtiger App
		driver.get("http://localhost:8888");

		// Step 4: identify UserName in Demo Vtiger and provide the data
		driver.findElement(By.name("user_name")).sendKeys("admin");
		
		// Step 5: identify UserName in Demo Vtiger and provide the data
		driver.findElement(By.name("user_password")).sendKeys("manager");
		
		// Step 6: Click on Login Button
		driver.findElement(By.id("submitButton")).click();

		// Step 7: click on Organizations Link
		driver.findElement(By.linkText("Organizations")).click();

		// Step 8:Identify all the organization names
		List<WebElement> list = driver.findElements(By.xpath("//a[@title='Organizations']"));

		// Step 9: capture all the org Names and print in console
		for (WebElement ele : list) {
			String value = ele.getText();
			System.out.println(value);
		}

	}

}
