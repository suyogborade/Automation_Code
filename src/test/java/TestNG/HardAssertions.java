package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertions {

	@Test
	void test() 
	{
		int x= 10;
		int y= 20;
			
	/*	if(x==y) 
		{
			System.out.println("Test Passsed");
		}
		
		else
		{
			System.out.println("Test Failed");
		} */
		
		
		//Assert.assertEquals(x, y);
		
		int a =10;
		 int b = 20 ;
		 
		// Assert.assertEquals(a>b, true,"a is not greater than b");  //false
		 
		 
		 String s1 = "abc";
		 String s2 = "abc1";
		 
		//  Assert.assertEquals(s1, s2);
		 
		//  Assert.assertNotEquals(s1, s2 , "a is not equal to b");
		 
		 
		 if(false)
		 {
			 Assert.assertTrue(true);
		 }
		 
		 else
		 {
			// Assert.assertTrue(false);
			 Assert.fail();
		 }
		
	}
	
	
}
