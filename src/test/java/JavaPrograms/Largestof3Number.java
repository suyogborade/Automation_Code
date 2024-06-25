package JavaPrograms;

import java.util.Scanner;

public class Largestof3Number {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first Number : ");
		int a = sc.nextInt();
		
		System.out.println("Enter the Second Number : ");
		int b = sc.nextInt();
		
		System.out.println("Enter the Third Number : ");
		int c = sc.nextInt();
		
		
		if(a>b && a> c)
		{
			System.out.println(a + " A is the largest Number");
		}

		else if(b>a && b>c)
		{
			System.out.println(b+ " B is the largest Number ");
		}	
		
		else
		{
			System.out.println(c + " C is the largest Number ");
		}

		
	}

}
