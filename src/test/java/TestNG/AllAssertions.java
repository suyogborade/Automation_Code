package TestNG;

import org.testng.annotations.*;

public class AllAssertions {

	@BeforeSuite
	void bs() 
	{
		System.out.println("This is the Before Suit");
	}
	
	@BeforeTest
	void bt () 
	{
		System.out.println("This is the Before Test");
	}
	
	@BeforeClass
	void bc() 
	{
		System.out.println("This is the Before Class");
	}
	
	@BeforeMethod
	void bm() 
	{
		System.out.println("This is the Before Method");
	}
	
	@Test
	void test()
	{
		System.out.println("This is the Test Method");
	}
	
	@AfterMethod
	void am()
	{
		System.out.println("This is After Method");
	}
	
	@AfterClass
	void ac() 
	{
		System.out.println("This is After Class");
	}
	
	@AfterTest
	void at()
	{
		System.out.println("This is After test");
	}
	
	@AfterSuite
	void as() 
	{
		System.out.println("This is After Suit");
	}
	
}
