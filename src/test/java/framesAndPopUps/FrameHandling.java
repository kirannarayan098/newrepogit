package framesAndPopUps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FrameHandling {

	public static void main(String[] args) {

		// Step 1: Launch the browser
		WebDriver driver = new ChromeDriver();

		// Step 2: maximize the window
		driver.manage().window().maximize();

		// Step 3: wait for 10 seconds
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Step 4: Load the URL - Demo Vtiger App
		driver.get("https://jqueryui.com/droppable/");
		
		//Handle The Frame
		driver.switchTo().frame(0);
		System.out.println("Switched the control to the frame");
		
		//Drag and Drop
		WebElement drag = driver.findElement(By.id("draggable"));
		WebElement drop = driver.findElement(By.id("droppable"));
		
		Actions act = new Actions(driver);
		act.dragAndDrop(drag, drop).perform();
		System.out.println("drag and drop successful");
		
		//Swicth the control back to main page
		driver.switchTo().defaultContent();
		System.out.println("switched the control to main page");
		
		//click on Accept link
		driver.findElement(By.linkText("Accept")).click();
		System.out.println("Click on accept link");
		
		
	}

}
