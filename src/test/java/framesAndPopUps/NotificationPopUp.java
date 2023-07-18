package framesAndPopUps;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NotificationPopUp {

	public static void main(String[] args) {
		
		//Browser settings
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--disable-notifications");
		
		// Step 1: Launch the browser
		WebDriver driver = new ChromeDriver(op);

		// Step 2: maximize the window
		driver.manage().window().maximize();

		// Step 3: wait for 10 seconds
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Load the application
		driver.get("https://yatra.com");
	}

}
