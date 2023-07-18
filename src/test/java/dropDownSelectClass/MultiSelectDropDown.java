package dropDownSelectClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectDropDown {

	public static void main(String[] args) throws InterruptedException {

		// Step 1: Launch the browser
		WebDriver driver = new ChromeDriver();

		// Step 2: maximize the window
		driver.manage().window().maximize();

		// Step 3: load the URL
		driver.get("https://demoqa.com/select-menu");
		
		//Step 4: Identify the web element
		WebElement multiSelectDropdown = driver.findElement(By.id("cars"));
		
		//Check if it is a multi select drop down
		Select sel = new Select(multiSelectDropdown);
		boolean value = sel.isMultiple();
		if(value==true)
		{
			System.out.println("Its a multi select dropdown");
		}
		else
		{
			System.out.println("Its a single select drop down");
		}
		
		//Select Audi and Volvo options from drop down list
		sel.selectByValue("volvo");
		System.out.println("volvo selected");
		Thread.sleep(1000);
		
		sel.selectByVisibleText("Audi");
		System.out.println("Audi Selected");
		Thread.sleep(1000);
		
		sel.selectByIndex(2);
		System.out.println("Opel selected");
		Thread.sleep(1000);
		
		//de-select Audi from the selected options in drop down List
		sel.deselectByVisibleText("Audi");
		System.out.println("Audi is removed from selection list");
		Thread.sleep(1000);
		
		//deselect all the selected options
//		sel.deselectAll();
//		System.out.println("All the selected options are deselected");
		
		//Get All Selected options
		List<WebElement> allSel = sel.getAllSelectedOptions();
		for(WebElement ele:allSel)
		{
			System.out.println(ele.getText());
		}
		
		//Get First Selected option
		WebElement first = sel.getFirstSelectedOption();
		System.out.println("First selected option - "+first.getText());
		
		//Get Wrapped element - give u all the elements inside the base element
		WebElement allElements = sel.getWrappedElement();
		System.out.println(allElements.getText());
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
