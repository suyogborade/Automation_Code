package Java;

import java.util.Scanner;

public class HandleMultipleException_Catch {

	public static void main(String[] args) {
		
System.out.println("Program Execution is Started");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Number : ");
		//int num = sc.nextInt();
		
		String s = null;
		
		try {
		//System.out.println(100/num);
			System.out.println(s.length());
		}
		
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic Exception error thrown");
		}
		
		catch(NumberFormatException e)
		{
			System.out.println("NumberFormatException error thrown");
		}
		
		catch(NullPointerException e)
		{
			System.out.println("Nullpointer Exception thrown");
		}
		
		System.out.println("Program Execution Completed");

		
		
	}

}
