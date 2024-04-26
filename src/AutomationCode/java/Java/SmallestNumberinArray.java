package Java;

import java.util.Arrays;

public class SmallestNumberinArray {

	public static void main(String[] args) {

		int a[] = { 900, 123, 99, 10, 200, 400, 500, 800, 600 };

		Arrays.sort(a);

		/*
		 * for(int b :a) { System.out.println(b); }
		 */

		// System.out.println();

		System.out.println("Smallest Number" + a[0]);

		String price = "$200.17";

		String d = price.replace("$", "");

		// System.out.println(d);

		System.out.println(Double.parseDouble(d));
	}

}
