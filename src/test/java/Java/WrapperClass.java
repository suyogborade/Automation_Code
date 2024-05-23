package Java;

public class WrapperClass {

	public static void main(String[] args) {
		
		//primitive 
		int i = 10;
		double d = 19.50;
		char c = 'A';
		boolean b = true;
		
		//Converting primitive data types to Object type - Autoboxing
		Integer iobj = i; //object
		Double dobj=d;
		Character cobj =c;
		Boolean bobj= b;
		
		System.out.println(iobj);
		System.out.println(dobj);
		System.out.println(cobj);
		System.out.println(bobj);
		
		System.out.println();
		
		//Convert object to primitive type is Unboxing
		
		int ivalue = iobj;
		double dvalue=dobj;
		char cvalue=cobj;
		boolean bvalue=bobj;
		
		System.out.println(ivalue);
		System.out.println(dvalue);
		System.out.println(cvalue);
		System.out.println(bvalue);
		
			
			

	}

}
