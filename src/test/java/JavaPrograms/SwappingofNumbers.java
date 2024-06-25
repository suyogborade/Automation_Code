package JavaPrograms;

public class SwappingofNumbers {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 20 ;
		
		System.out.println("Numbers Before swapping are " + a + " " + b);
		
	/*	//Using third variable
		int t=a;
		a=b;
		b=t;
		
		System.out.println("Numbers after swapping are " + a + " " + b);
		*/
		
		//using + & - without using third variable
		
	/*	a=a+b; //30
		b=a-b; //10
		a=a-b; //20 
		
		System.out.println("Numbers after swapping are " + a + " " + b);   */
		 
		a=a*b; //200
		b=a/b;
		a=a/b;
		
		System.out.println("Numbers after swapping are " + a + " " + b);	

	}

}
