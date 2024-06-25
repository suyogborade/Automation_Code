package JavaPrograms;

public class SumofNumbers {

	public static void main(String[] args) {
		
		int num = 123456;
		int sum=0;
		
		
		while(num>0)
		{
			sum = sum + num%10; //6+5 
			num = num/10; //1234
			
		}

		System.out.println("Sum of Total number is " + sum);
	}

}
