package TestNG;

import org.testng.annotations.Test;

public class InvocaTionCount {

	@Test(invocationCount = 10)
	void test() 
	{
		System.out.println("Testing Done");
	}
	
	
}
