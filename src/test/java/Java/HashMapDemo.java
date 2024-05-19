package Java;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		
		//HashMap hm = new HashMap();
		
		HashMap <Integer, String> hp = new HashMap<Integer,String>();
		
		//adding data pairs to hashmap
		
		hp.put(101, "Suyog");
		hp.put(102, "Ganesh");
		hp.put(103, "Akash");
		hp.put(104, "Suyog");
		hp.put(101, "Nilesh");
		hp.put(105, "Ganesh");
		
		System.out.println(hp);
		
		System.out.println(hp.size());
		
		//remove pair
		hp.remove(102);
		
		System.out.println("After removing " +hp);
		
		//print only keys from hashmap
		
		System.out.println(hp.keySet());
		
		//print values from the hashmap
		
		for(Object k : hp.keySet())
		{
			System.out.println(k + " " + hp.get(k));
		}
		
		//clear all data from the hashmap
		
		hp.clear();
		
		System.out.println(hp);
		
		
		
	}

}
