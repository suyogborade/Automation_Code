package JavaPrograms;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		
	/*	Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number ");
		
		int num = sc.nextInt();
		
		int rev=0;
		
		while(num!=0)
		{
			rev=rev*10 + num%10;
			num=num/10;
			
		}
		
		System.out.println("Reverse Number is : " + rev);
	  */
		
		
		int a = 121;
		
		StringBuffer sb = new StringBuffer(String.valueOf(a));
		StringBuffer s = sb.reverse();
		
		System.out.println(s);
		
		int org_num=a;
		
		int rev =0;
		
		while(a>0)
		{
			rev = rev*10 + a%10;
			a=a/10;
			
		}
		System.out.println(rev);
	

		if(org_num==rev)
		{
			System.out.println("Number is Palindrome " + org_num);
		}
		
		else
		{
			System.out.println("Number is not palindrome " + org_num);
		}
	
	}	
}
