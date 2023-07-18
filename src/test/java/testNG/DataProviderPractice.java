package testNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderPractice {
	
	@Test(dataProvider = "getData")
	public void dataProviderDemo(String name, int price) // capture the data from DataProvider
	{
		System.out.println("Phone is -> "+name+" and Price is -> "+price);
	}
	
	@DataProvider
	public Object[][] getData() // also working based on rows and columns
	{                             //row-3 columns-3
		Object[][] data = new Object[3][2];
		
		data[0][0] = "iphone"; // one data set
		data[0][1] = 25000;
		
		data[1][0] = "Samsung"; // second data set
		data[1][1] = 20000;
		
		data[2][0] = "Vivo"; // Third Data set
		data[2][1] = 10000;
		
		return data;
	}
	
	

}
