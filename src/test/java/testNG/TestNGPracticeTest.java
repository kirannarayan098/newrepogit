package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGPracticeTest {
	
	@Test
	public void createCustomer() //failed
	{
		Assert.fail();// purposefully fail the test script 2mins - result
		System.out.println("Customer is created");
		
	}
	
	@Test(dependsOnMethods = "createCustomer")
	public void modifyCustomer()//fail //2mins fail
	{
		System.out.println("customer is modified");
	}
	
	@Test(dependsOnMethods = {"createCustomer","modifyCustomer"})
	public void deleteCustomer() //fail //2mins - fail - 6mins
	{
		System.out.println("customer is deleted");
	}
	
	
	
}
