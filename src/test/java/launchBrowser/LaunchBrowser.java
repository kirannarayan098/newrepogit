package launchBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.SessionId;

public class LaunchBrowser {
	
	public static void main(String[] args) throws InterruptedException {
		
//		//To launch Chrome Browser
//		ChromeDriver driver = new ChromeDriver();
//		System.out.println("Chrome Browser launched");
//		
//		//To Launch Firefox Browser
//		FirefoxDriver driver1 = new FirefoxDriver();
//		System.out.println("Firefox is launched");
		
		//Upcast the chromeDRiver to web driver interface
		WebDriver driver = new ChromeDriver(); // used
		System.out.println("Chrome Browser launched");
		
		//To Maximise the Browser - method Chaining
		driver.manage().window().maximize();
		
		//To Load URL
		driver.get("https://flipkart.com"); // url is only way to access web application
		System.out.println("flipkart is loaded");
		
		//To capture the Page Title
		String title = driver.getTitle();
		System.out.println("Page Title is -> "+title);
		
		//To Capture the current URL
		String url = driver.getCurrentUrl();
		System.out.println("Current URL is -> "+url);
		
		//To Capture the source code of the current web Page
		String sourceCode = driver.getPageSource();
		//System.out.println("Page source is -> "+sourceCode);
		
		//To Capture the session ID
		String id =driver.getWindowHandle();
		System.out.println("Window Handle of current page is -> "+id);
		
		//Refresh the Page
		driver.navigate().refresh();	
		
		//Come back to previous Page
		driver.navigate().back();
		
		//navigaet to next page
		driver.navigate().forward();
		
		//Load URL through Navigation Interface
		driver.navigate().to("https://flipkart.com");
		
	    //get session ID
		SessionId id1 = ((RemoteWebDriver) driver).getSessionId();
		System.out.println("Session ID for the current Browser "+id1);
		
		//To Close the Browser
		Thread.sleep(2000);
		driver.close(); // close only the current browser tab/page/window
		System.out.println("Browser is closed");
		
		driver.quit(); // close all the current tabs/pages/windows
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
