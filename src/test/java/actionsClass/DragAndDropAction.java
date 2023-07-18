package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropAction {

	public static void main(String[] args) throws InterruptedException {

		// Step 1: Launch the browser
		WebDriver driver = new ChromeDriver();

		// Step 2: maximize the window
		driver.manage().window().maximize();

		// Step 3: load the URL
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
		//Drag and Drop operation
		WebElement capital = driver.findElement(By.xpath("//div[.='Washington'][2]"));
		
		WebElement country = driver.findElement(By.xpath("//div[.='United States']"));
		
		Actions act = new Actions(driver);
		
		act.dragAndDrop(capital, country).perform();
		Thread.sleep(1000);
		
		System.out.println("drag and drop successfull");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
