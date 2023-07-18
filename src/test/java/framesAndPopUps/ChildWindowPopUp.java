package framesAndPopUps;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWindowPopUp {

	public static void main(String[] args) throws InterruptedException {

		// Step 1: Launch the browser
		WebDriver driver = new ChromeDriver();

		// Step 2: maximize the window
		driver.manage().window().maximize();

		// Step 3: wait for 10 seconds
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Load the application
		driver.get("https://demo.automationtesting.in/Windows.html");
		

		driver.findElement(By.linkText("Open New Seperate Windows")).click();
		
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		
		Thread.sleep(2000);
		
		Set<String> windows = driver.getWindowHandles();
		
		/* When ever there is only one child window associated with the main window
		 * then we can identify the main window ID using getWindowHanle() and eliminate 
		 * the main window ID using If condition and easily switch to Child winodw ID*/
		
//		String mainID = driver.getWindowHandle();
//		System.out.println("main window ID is - "+mainID);
		
//		for(String win:windows)
//		{
//			if(!win.equals(mainID))//eliminate the main window ID
//			{
//				System.out.println("This is child ID - "+win);
//				driver.switchTo().window(win);
//				break;
//			}
//			
//		}
		
		/* When there are more than one child windows, We cannot switch to particular
		 * child based on only window ID, ww should consider title or URL of the 
		 * child and switch */
		
		for(String win:windows)
		{
			WebDriver currentWindowID = driver.switchTo().window(win);
			String currentWinTitle = currentWindowID.getTitle();
			if(currentWinTitle.contains("Selenium"))
			{
				System.out.println(currentWinTitle);
				break;
			}
		}
		
		Thread.sleep(1000);
		System.out.println("Control is swicthed to Child Window");
		
		driver.findElement(By.xpath("//span[.='Downloads']")).click();
		Thread.sleep(2000);
		
		for(String win:windows)
		{
			WebDriver currentWindowID = driver.switchTo().window(win);
			String currentWinTitle = currentWindowID.getTitle();
			if(currentWinTitle.contains("Frames"))
			{
				System.out.println(currentWinTitle);
				break;
			}
		}
		
		Thread.sleep(1000);
		System.out.println("control is switched to parent window");
		
		driver.findElement(By.linkText("Register")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
