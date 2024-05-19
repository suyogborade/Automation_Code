package Java;

import java.util.HashSet;

public class HashSetCollection {

	public static void main(String[] args) {
		
		//Delcaration
		HashSet myset = new HashSet();
		//HashSet <Integer> intset = new HashSet<Integer>();
		
		//add value in array
		myset.add(100);
		myset.add("Java");
		myset.add('G');
		myset.add(null);
		myset.add(10.50);
		myset.add(100);
		myset.add(null);
		
		System.out.println(myset.size());
		System.out.println(myset);
		
		//remove value from the hashset
		myset.remove(10.50); // we have to pass value but not index - index wont support
		
		System.out.println("After value reomove" + myset);
		 
		//insertion is not possible in hashset always added at the last
		
		//get specific value from hashset - not possible because indexing is not supported
		
		//read data 
		
		for(Object y : myset)
		{
			System.out.println(y);
		}
		
	}

}
