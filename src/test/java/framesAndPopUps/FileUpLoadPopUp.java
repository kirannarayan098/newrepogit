package framesAndPopUps;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpLoadPopUp {

	public static void main(String[] args) throws IOException {

		// Step 1: Launch the browser
		WebDriver driver = new ChromeDriver();

		// Step 2: maximize the window
		driver.manage().window().maximize();

		// Step 3: wait for 10 seconds
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Load the application
//		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
//		
//		driver.findElement(By.xpath("//button[.='Upload Resume']")).click();
//		
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0,200)", "");
//		
//		//Upload the file using AutoIT
//		Runtime.getRuntime().exec("C:\\Users\\Chaithra N\\Documents\\resume.exe");
//		
//		System.out.println("File uploading complete");
		
		driver.get("https://www.foundit.in/seeker/registration");
		
		WebElement ele = driver.findElement(By.xpath("//input[@type='file']"));
		
		ele.sendKeys("C:\\Users\\Chaithra N\\Downloads\\Preeti Gudada.docx");
		
		System.out.println("file uploaded");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
