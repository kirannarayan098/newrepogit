package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoveringAction {

	public static void main(String[] args) throws InterruptedException {

		// Step 1: Launch the browser
		WebDriver driver = new ChromeDriver();

		// Step 2: maximize the window
		driver.manage().window().maximize();

		// Step 3: load the URL
		driver.get("https://flipkart.com");
		
		driver.findElement(By.xpath("//button[.='✕']")).click();
		Thread.sleep(1000);
		
		//mouse hovering action
		WebElement element = driver.findElement(By.xpath("//div[.='Electronics']"));
		
		Actions act = new Actions(driver);
		act.moveToElement(element).perform();
		System.out.println("mouse hovering done");

	}

}
