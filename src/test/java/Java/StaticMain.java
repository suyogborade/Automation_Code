package Java;

public class StaticMain {

	public static void main(String[] args) {

		System.out.println(StaticExample.a);

		StaticExample.m1();

		StaticExample se = new StaticExample();
		System.out.println(se.b);
		se.m2();

	}

}
