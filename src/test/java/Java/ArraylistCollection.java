package Java;

import java.util.ArrayList;

public class ArraylistCollection {

	public static void main(String[] args) {
		
		//declaration
		ArrayList mylist = new ArrayList();
		//List mylis = new ArrayList();

		//adding data into the ArrayList
		
		mylist.add(100);
		mylist.add(10.5);
		mylist.add('A');
		mylist.add("Automation");
		mylist.add(true);
		mylist.add(null);
		mylist.add(null);
		mylist.add("Selenium");
		
		//Size of arraylist
		System.out.println(mylist.size());
		
		System.out.println(mylist);
		
		//remove value from the arraylist
		mylist.remove(5);
		
		System.out.println("After removing " + mylist);
		
		//add value in arraylist
		mylist.add("SaaS");
		
		mylist.add(1, "WebDriver");
		
		System.out.println("Inserting Data " + mylist);
		
		System.out.println(mylist.get(4));
		
		//Read data from arraylist
		for(Object x : mylist) {
			System.out.println(x);
		}
		
		mylist.clear();
		
		System.out.println("Delete data " + mylist);
	}

}
