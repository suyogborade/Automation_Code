package Java;

public class Exception {

	public static void main(String[] args) {
		
		//Example 1
	/*	System.out.println("Program is Started");
		System.out.println("Program is in Progress ....");
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a Number : ");
		 
		int num = sc.nextInt();
		
		System.out.println(100/num); // ArithmeticException
		
		System.out.println("Program is Completed "); 
		
		*/
		
		//Example 2
/*		int a [] = new int [5];
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		
		System.out.println("Enter Position: ");
		int pos = sc.nextInt();
		
		a[pos]= num; // ArrayIndexOutOfBoundsException
		
		System.out.println(a[pos]);
		
		System.out.println("Program is Completed ");
	
		
		*/
		
		//Example 3
		
		String s = "Welcome";
		
		int num = Integer.parseInt(s); //NumberFormatException
		
		System.out.println(s);
		
		System.out.println("Program is Completed");
		
	}

}
