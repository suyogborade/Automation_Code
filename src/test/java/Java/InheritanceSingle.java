package Java;

class A 
{
	int a;
	
	void display()
	{
		System.out.println(a);
	}
}


class B extends A
{
	int b;
	
	void show()
	{
		System.out.println(b);
	}
}


public class InheritanceSingle {
	
	public static void main(String[] args) {
		
		B ob = new B();
		
		ob.a=100;
		ob.b=500;
		
		
		ob.show();
		

	}

}
