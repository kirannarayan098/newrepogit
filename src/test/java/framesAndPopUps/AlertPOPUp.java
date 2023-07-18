package framesAndPopUps;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPOPUp {

	public static void main(String[] args) throws InterruptedException {

		// Step 1: Launch the browser
		WebDriver driver = new ChromeDriver();

		// Step 2: maximize the window
		driver.manage().window().maximize();

		// Step 3: wait for 10 seconds
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Step 4: Load the URL - Demo Vtiger App
		driver.get("https://demoqa.com/alerts");
		
		//Handle alert pop Up - OK button - click OK
		driver.findElement(By.id("alertButton")).click();
		
		Thread.sleep(1000);
		Alert alert = driver.switchTo().alert();

		alert.accept();
		System.out.println("click ok On Alert pop up");
		Thread.sleep(1000);
		
		//Get TExt from Alert popup
		driver.findElement(By.id("alertButton")).click();
		
		Thread.sleep(1000);
		Alert alert1 = driver.switchTo().alert();
		String text = alert1.getText();
		System.out.println(text);
		alert1.accept();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,200)", "");
		Thread.sleep(1000);
		
		//Dismiss the confirmation popUp
		driver.findElement(By.id("confirmButton")).click();
		Thread.sleep(1000);
		
		driver.switchTo().alert().accept();
		
		String successMsg = driver.findElement(By.xpath("//span[@class='text-success']")).getText();
        System.out.println(successMsg);
        
        //enter data into prompt popup
        driver.findElement(By.id("promtButton")).click();
        Thread.sleep(3000);
        
        
        Alert al=driver.switchTo().alert();
        al.sendKeys("Chaitra");
        al.accept();
        
        String msg = driver.findElement(By.xpath("(//span[@class='text-success'])[2]")).getText();
        System.out.println(msg);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
	}

}
