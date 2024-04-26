package Java;

public class TwoDimArray {

	public static void main(String[] args) {

		// Approach 1
		// int a[] [] = new int [3] [2];

		/*
		 * a[0] [0]=100; a[0] [1]=200; a[1] [1]=300; a[1] [0]=400; a[2] [0]=500; a[2]
		 * [1]=600;
		 */

		// Approach 2

		int a[][] = { { 100, 200, 700 }, { 300, 400, 900 }, { 500, 600, 1000 } };

		System.out.println(a.length);
		System.out.println(a[0].length);

		/*
		 * for(int r=0; r<a.length; r++) {
		 * 
		 * for(int c=0; c<a[r].length; c++) { System.out.println(a[r][c]); } }
		 */

		for (int x[] : a) {

			for (int y : x) {
				System.out.print(y + " ");
			}
			System.out.println();
		}

	}

}
