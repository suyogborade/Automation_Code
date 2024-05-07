package Java;

interface shape
{
	int length =10; //final & static
	int width = 20; //final & static
	
	void circle(); //abstract method unimplemented
	
	default void square()
	{
		System.out.println("This is the Square by Default method");
	}
	
	static void rectangle()
	{
		System.out.println("This is Rectangle");
	}
}


public class InterfaceInheritance implements shape{
	
	public void circle() 
	{
		System.out.println("This is Circle");
	}

	public static void main(String[] args) {
		
		InterfaceInheritance idobj = new InterfaceInheritance();
		
		idobj.circle();
		idobj.square();
		shape.rectangle();
		
		

	}

}
