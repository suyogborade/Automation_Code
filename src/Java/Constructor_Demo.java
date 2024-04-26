package Java;

public class Constructor_Demo {
	
	int x,y;
	String s;
	
	
	Constructor_Demo() //Default constructor
	{
		x=100;
		y=200;
		s="Automation Selenium";
	}
	
	void dataDisplay()
	{
		System.out.println(x);
		System.out.println(y);
		System.out.println(s);
	}	
	
	

	public static void main(String[] args) {
		
		Constructor_Demo cd = new Constructor_Demo();
		cd.dataDisplay();
		

	}

}
