package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSSelectorExample {

	public static void main(String[] args) {

		// Step 1: Launch the browser
		WebDriver driver = new ChromeDriver();

		// Step 2: maximize the window
		driver.manage().window().maximize();

		// Step 3: Load the URL - Demo Vtiger App
		driver.get("https://demo.actitime.com/login.do");

		// Step 4: Identify the Username textField and enter username 
//		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("Hi");
//		System.out.println("data sent");
//		driver.findElement(By.cssSelector("input[type='text']")).clear();
//		String attribute = driver.findElement(By.cssSelector("input[type='text']")).getAttribute("type");
//        System.out.println(attribute);
//        String attribute1 = driver.findElement(By.cssSelector("input[type='text']")).getCssValue("font-size");
//        System.out.println(attribute1);
//        
//        Point loc = driver.findElement(By.cssSelector("input[type='text']")).getLocation();
//        System.out.println(loc.getX());
//        System.out.println(loc.getY());
//        
//        Dimension dimen = driver.findElement(By.cssSelector("input[type='text']")).getSize();
//        System.out.println(dimen.getHeight());
//        System.out.println(dimen.getWidth());
//        
//        Rectangle rect = driver.findElement(By.cssSelector("input[type='text']")).getRect();
//        System.out.println(rect.getHeight());
//        System.out.println(rect.getWidth());
//        System.out.println(rect.getX());
//        System.out.println(rect.getY());
        
//        String tag = driver.findElement(By.cssSelector("input[type='text']")).getText();
//		System.out.println(tag);
//		System.out.println("No text");
		
	   String value = driver.findElement(By.cssSelector("input[type='text']")).getAccessibleName();
		System.out.println(value);
		
		String data = driver.findElement(By.cssSelector("input[type='text']")).getAriaRole();
		System.out.println(data);
		
		String role = driver.findElement(By.cssSelector("#loginButton")).getAriaRole();
		System.out.println(role);
		
		String at = driver.findElement(By.cssSelector("#loginButton")).getDomAttribute("id");
		System.out.println(at);
		
		String prop = driver.findElement(By.cssSelector("#loginButton")).getDomProperty("background");
		System.out.println(prop);
		
//		// Step 5: Identify the password textField and enter password 
//		driver.findElement(By.cssSelector(".pwdfield")).sendKeys("manager");
//
//		// Step 6: Identify the Login button and click 
//		driver.findElement(By.cssSelector("#loginButton")).click();

		// driver.findElement(By.tagName("a")).click();

	}

}
