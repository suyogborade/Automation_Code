package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethods {

	@Test (priority=1)
	void OpenApp()
	{
		System.out.println("Open App");
		
		Assert.assertTrue(true);
	}
	
	@Test (priority=2 , dependsOnMethods = "OpenApp")
	void Login() 
	{
		System.out.println("Login Successfully ");
		
		Assert.assertTrue(false);
	}
	
	@Test (priority=3, dependsOnMethods ="Login" )
	void Search()
	{
		System.out.println("Search Completed");
	}
	
	@Test (priority=4 , dependsOnMethods = "Search")
	void AdvancedSearch() 
	{
		System.out.println("Advance Search Completed");
	}
	
	@Test (priority=5 )
	void LogOut() 
	{
		System.out.println("Logout Successfully");
		
		Assert.assertTrue(true);
	}
	
}

