package framesAndPopUps;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationPopUp {

	public static void main(String[] args) {

		// APP url:- https://the-internet.herokuapp.com/basic_auth
		// App authentication username - admin
		// App authentication password - admin
		
		// https://admin:admin@the-internet.herokuapp.com/basic_auth

		// Step 1: Launch the browser
		WebDriver driver = new ChromeDriver();

		// Step 2: maximize the window
		driver.manage().window().maximize();

		// Step 3: wait for 10 seconds
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Load the application
		driver.get("https://the-internet.herokuapp.com/basic_auth");

	}

}
