package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickAndSendKeys {

	public static void main(String[] args) {

		// Step 1: Launch the browser
		WebDriver driver = new ChromeDriver();

		// Step 2: maximize the window
		driver.manage().window().maximize();

		// Step 3: load the URL
		driver.get("http://localhost:8888");
		
		WebElement un = driver.findElement(By.name("user_name"));
		WebElement submit = driver.findElement(By.id("submitButton"));
		
		//Sendkeys and click
		Actions act = new Actions(driver);
		act.sendKeys(un,"admin",Keys.TAB,"manager").perform();
		act.click(submit).perform();
		
		
		
		
		
	}

}
