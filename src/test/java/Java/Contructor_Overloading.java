package Java;

public class Contructor_Overloading {

	int x, y;

	double d;

	Contructor_Overloading() {
		x = 10;
		y = 200;
	}

	Contructor_Overloading(int a, int b) {
		x = a;
		y = b;

	}

	Contructor_Overloading(int a, double b) {
		x = a;
		d = b;
	}

	Contructor_Overloading(double b, int a) {
		x = a;
		d = b;
	}

	void displayData() {
		System.out.println(x);
		System.out.println(y);
		System.out.println(d);
	}

	public static void main(String[] args) {

		Contructor_Overloading cdo = new Contructor_Overloading(10.230, 2090);
		cdo.displayData();

	}

}
