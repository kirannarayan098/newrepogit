package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginToApp {
	
	public static void main(String[] args) {
		
		//Step 1: Launch the browser
		WebDriver driver = new ChromeDriver();
		
		//Step 2: maximize the window
		driver.manage().window().maximize();
		
		//Step 3: Load the URL - Demo Vtiger App
		driver.get("http://localhost:8888");
		
		//Step 4: identify UserName in Demo Vtiger
		WebElement usernameEle = driver.findElement(By.name("user_name"));
		
		//perform action on the web element identified
		usernameEle.sendKeys("admin");
		
		//Step 5: identify password in demo Vtiger
		WebElement passwordEle = driver.findElement(By.name("user_password"));
		
		//perform action on the web element identified
		passwordEle.sendKeys("manager");
		
		//Step 6: identify the login button in demo Vtiger
		WebElement loginEle = driver.findElement(By.id("submitButton"));
		
		//perform action on the web element identified
        loginEle.submit();
        
        
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
