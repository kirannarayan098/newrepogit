package dropDownSelectClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleSelectDropDown {

	public static void main(String[] args) throws InterruptedException {

		// Step 1: Launch the browser
		WebDriver driver = new ChromeDriver();

		// Step 2: maximize the window
		driver.manage().window().maximize();
		
		//Step 3: load the URL
		driver.get("https://demoqa.com/select-menu");
		
		//Step 4: locate a drop down
		WebElement singleSelectDropdown = driver.findElement(By.id("oldSelectMenu"));
		
		//Step 5: To handle the dropdown create object of Select class
		Select sel = new Select(singleSelectDropdown);
		
		//Step 6: select option in side the dropdown - using Index
		sel.selectByIndex(8);
		System.out.println("index 8 selected");
		Thread.sleep(2000);
		
		//select option in side the dropdown - using value = "7"
		sel.selectByValue("7");
		System.out.println("value selected");
		Thread.sleep(2000);
		
		//select option in side the dropdown - using Visible Text
		sel.selectByVisibleText("Yellow");
		System.out.println("Yellow visisble text selected");

		//Check if the drop down is multi select drop down or single select drop down
		boolean status = sel.isMultiple();
		if(status==true)
		{
			System.out.println("Yes!! its a multi-Select drop down");
		}
		else
		{
			System.out.println("Nope! Its a Single Select drop down");
		}
		
		//Check all the options inside a drop down
		List<WebElement> listOp = sel.getOptions();
		int count=0;
		
		for(WebElement ele:listOp)
		{
			count++;
			System.out.println(ele.getText());
			
		}
		System.out.println(count);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
