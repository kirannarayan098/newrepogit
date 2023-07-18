package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickAction {

	public static void main(String[] args) throws InterruptedException {

		// Step 1: Launch the browser
		WebDriver driver = new ChromeDriver();

		// Step 2: maximize the window
		driver.manage().window().maximize();

		// Step 3: load the URL
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		//Context Click
		WebElement ele = driver.findElement(By.xpath("//span[.='right click me']"));
		
		WebElement edit = driver.findElement(By.xpath("//span[.='Edit']"));
		
		Actions act = new Actions(driver);
		act.contextClick(ele).perform();
		
		Thread.sleep(1000);
		
		act.click(edit).perform();

	}

}
