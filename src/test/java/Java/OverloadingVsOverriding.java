package Java;

class MN {
	void m1(int a) {
		System.out.println(a);
	}

	void m2(int b) {
		System.out.println(b);
	}
}

class PQ extends MN {
	void m1(int a) // overrided method
	{
		System.out.println(a * a);
	}

	void m2(int a, int b) // overloaded method
	{
		System.out.println(a + b);
	}
}

public class OverloadingVsOverriding {

	public static void main(String[] args) {
		
		PQ p = new PQ();
		
		p.m1(10);
		p.m2(200);
		p.m2(10,20);

	}

}
