package Java;

public class Interface_ABCMain extends Inheritance_Class implements Interface_A, Interface_B{

	
	@Override
	public void m2() {
		
		System.out.println("This is method m2 from A");
		System.out.println(x);
		
	}

	@Override
	public void m1() {
		
		System.out.println("This is method m1 from B");
		System.out.println(y);
		
	}
	
	public static void main(String[] args) {
		
		Interface_ABCMain ab = new Interface_ABCMain();
		ab.m1();
		ab.m2();
		ab.m3();

	}

	

}
