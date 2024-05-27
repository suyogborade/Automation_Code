package TestNG;

import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

public class HardVsSoftAssertions {

	 //@Test
	void HardAssertion() 
	{
		System.out.println("Testing ......");
		System.out.println("Testing ......");
		System.out.println("Testing ......");
		System.out.println("Testing ......");
		
		
		Assert.assertEquals(1, 2); //if it fails then below statement will not executed
		
		System.out.println("Hard Assertion Completed");
		
		Assert.assertEquals(1, 1);
	}
	
	@Test
	void SoftAssertion() 
	{
		System.out.println("Testing ......");
		System.out.println("Testing ......");
		System.out.println("Testing ......");
		System.out.println("Testing ......");
		
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(1, 2);
		
		System.out.println("Soft Assertion Completed");
		//sa.assertEquals(1, 1);
		
		sa.assertAll();
		
	}
	
	
}
