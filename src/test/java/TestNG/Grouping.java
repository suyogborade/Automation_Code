package TestNG;

import org.testng.annotations.Test;

public class Grouping {

	@Test (priority=1, groups = {"Sanity", "regression"})
	void loginByEmail() 
	{
		System.out.println("This Is Login By Email");
	}
	
	@Test (priority=2, groups={"Sanity"})
	void loginByFacebook() 
	{
		System.out.println("This is Login By Facebook");
	}
	
	@Test (priority=3, groups= {"Sanity"})
	void loginByTwitter() 
	{
		System.out.println("This is Login By Twitter");
	}
	
	@Test (priority=4, groups= {"Sanity", "regression"})
	void signupByEmail()
	{
		System.out.println("This is Signup By Email");
	}
	
	@Test (priority=5, groups= {"regression"})
	void signupByFacebook()
	{
		System.out.println("This is Sign up By Facebook");
	}
	
	@Test (priority=6 , groups= {"regression"})
	void signupByTwitter()
	{
		System.out.println("This is Sign up By Twitter");
	}
	
	@Test (priority=7, groups= {"Sanity", "regression"})
	void paymentinDollar()
	{
		System.out.println("Payment by Dollar USD");
	}
	
	@Test (priority=8, groups= {"Sanity", "regression"})
	void paymentinRupees()
	{
		System.out.println("Payment by Rupees INR");
	}
	
	@Test (priority=9, groups= {"regression"})
	void paymentReturnbyBank()
	{
		System.out.println("Payment Return by Bank");
	}
	
}

