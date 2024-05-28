package TestNGListener;

import org.testng.annotations.Test;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;


public class MyListener implements ITestListener {

	@Test
	public void onTestStart(ITestResult result)
	{
	   System.out.println("Test Started ..... ");
	  }
	
	@Test
	public void onTestSuccess(ITestResult result)
	{
	    System.out.println("On Test Success");
	  }
	
	@Test
	public void onTestFailure(ITestResult result)
	{
	   System.out.println("On Test Failure ....");
	  }
	
	
	@Test
	public void onTestSkippd(ITestResult result)
	{
	   System.out.println("On test result ...");
	  }
	
	
	@Test
	public void onTestFinish(ITestContext context)
	{
	    System.out.println("On test Finished . . . . .");
	  }
	
}
