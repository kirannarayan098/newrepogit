package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * This is a pom class for Login page of ActiTime Application
 * @author Chaitra M
 */

public class LoginPage { // Rule 1: create a seperate pom class for every web page
	
	//Rule 2: identify the web elements of this page using @FindBy,@FindBys @FindAll
	@FindBy(id = "username") 
	private WebElement userNameEdt;//Edt = edit which means its textx field
	
	@FindBy(name = "pwd")
	private WebElement passwordEdt;
	
	@FindBy(id = "loginButton")
	private WebElement loginLnk; //lnk its a link // Btn button //dropDwn
	
	
	
	//Rule 3: create a constructor to initialise the web elements
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this); // current driver reference
	}

	//Rule 4: Provide getters to Access these web elements

	public WebElement getUserNameEdt() {
		return userNameEdt;
	}

	public WebElement getPasswordEdt() {
		return passwordEdt;
	}

	public WebElement getLoginLnk() {
		return loginLnk;
	}
	
	
	//Business Library - method created using the elements related to this page only
	/**
	 * This method will login to app
	 * @param USERNAME
	 * @param PASSWORD
	 */
	public void loginToApp(String USERNAME, String PASSWORD)
	{
		userNameEdt.sendKeys(USERNAME);
		passwordEdt.sendKeys(PASSWORD);
		loginLnk.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
