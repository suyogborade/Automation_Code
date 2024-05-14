package Java;

import java.util.Scanner;

public class HandleException {

	public static void main(String[] args) {
		
		System.out.println("Program Execution is Started");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Number : ");
		int num = sc.nextInt();
		
		try {
		System.out.println(100/num);
		}
		
		catch(ArithmeticException e)
		{
			System.out.println("You have entered invalid Input ");
		}
		
		System.out.println("Program Execution is Completed");

	}

}
