package Java;

import java.util.Arrays;

public class ArraysSingleDim {

	public static void main(String[] args) {

		int a[] = new int[5];
		
		a[0] = 100;
		a[1] = 200;
		a[2] = 300;
		a[3] = 400;
		a[4] = 500;
		
		//Find the length of the array
		System.out.println(a.length);
		
		//Print single value
		System.out.println(a[3]);
		
		//Print all the values from an Array
		System.out.println(Arrays.toString(a));
		
		//Get all the values by using Loop
		for(int i=0; i<a.length; i++) 
		{
			System.out.println(a[i]);
		}
		
		System.out.println("-------------------");
		
		for(int b : a) {
			System.out.println(b);
		}

	}

}
