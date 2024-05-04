package Java;


class PA 
{
	int a;
	
	void display() {
		System.out.println(a);
	}
}

class CB extends A
{
	int b;
	
	void show() {
		System.out.println(b);
	}
}

class C extends B
{
	int c;
	
	void print() {
		System.out.println(c);
	}
}

public class InheritanceMultiLevel {

	public static void main(String[] args) {
		
		C ob = new C();
		
		ob.a=10;
		ob.b=100;
		ob.c=1000;
		
		ob.display();
		ob.show();
		ob.print();

	}

}
