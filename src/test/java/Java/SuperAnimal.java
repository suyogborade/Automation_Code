package Java;

public class SuperAnimal {
	
	String color = "Black";
	
	void eat()
	{
		System.out.println("Eating Pav Bhaji");
	}	

}


class dog  extends SuperAnimal
{
	String color = "White";
	
	void displaycolor() 
	{
		System.out.println(super.color);
	}
	
	
	void eat()
	{
		super.eat();
		System.out.println("Eating Misal Pav ");
		
	}
}