package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickHoldAndReleaseAction {

	public static void main(String[] args) throws InterruptedException {

		// Step 1: Launch the browser
		WebDriver driver = new ChromeDriver();

		// Step 2: maximize the window
		driver.manage().window().maximize();

		// Step 3: load the URL
		driver.get("https://demoqa.com/buttons");
		
		WebElement clickEle = driver.findElement(By.xpath("//button[.='Click Me']"));
		
		//Click and Hold Operation
		Actions act = new Actions(driver);
		
		act.clickAndHold(clickEle).perform();
		System.out.println("elemnet clicked and held");
		
		Thread.sleep(1000);
		
		act.release(clickEle).perform();
		System.out.println("element released");

	}

}
