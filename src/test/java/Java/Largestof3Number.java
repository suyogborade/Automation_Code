package Java;

public class Largestof3Number {

	public static void main(String[] args) {
		
		int a= 1000, b=800, c=500;
		
		if(a>b && a>c) {
			System.out.println("A is larget Number :" + a);
			
			}

		else if(b>a && b>c) {
			System.out.println("B is largest Number :" + b);
		}
		
		
		else{
			System.out.println("C is Largest Number :" + c);
		}
	}

}
