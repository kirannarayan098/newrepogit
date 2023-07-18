package takeScreenshotInterface;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class CaptureScreenshot {

	public static void main(String[] args) throws IOException {

		// Step 1: Launch the browser
		WebDriver driver = new ChromeDriver();

		// Step 2: maximize the window
		driver.manage().window().maximize();

		// Step 3: load the URL
		driver.get("http://localhost:8888");

		// identify the elements
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("manager");
		driver.findElement(By.id("submitButton")).click();
		
		System.out.println("Home page displayed");
		
		//take screen shot of home Page
		
		//Step 1: cast the Takescreenshot interface to the driver
		TakesScreenshot ts = (TakesScreenshot) driver;
		
		//Step 2: call get screenshot as method
		File srcLocation = ts.getScreenshotAs(OutputType.FILE);
		
		//Step 3: create a folder to store the screen shots
		File dstLocation = new File(".\\ScreenShots\\Screenshot2.png");
		
		//Step 4: copy the screenshot from src to dst
		Files.copy(srcLocation, dstLocation); // Files class is used from commons io
		
		System.out.println("screen shot taken");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
