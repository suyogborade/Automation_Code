package Java;

public class DataConversionMethods {

	public static void main(String[] args) {
		
		//Scenario 1
		//String ----> integer
		
		//String to primitive data types are Unboxing
		
		String s1 = "100";
		String s2 = "200";
		
		int S1 = Integer.parseInt(s1);
		
		int S2 = Integer.parseInt(s2);
		
		System.out.println(S1+S2);
		
		System.out.println(Integer.parseInt(s1)*Integer.parseInt(s2));
		
		//String ----> double
		
		String a = "110.50";
		String b = "90.60";
		
		double ad = Double.parseDouble(a);
		double bd = Double.parseDouble(b);
		
		System.out.println(ad+bd);
		System.out.println(Double.parseDouble(a)*Double.parseDouble(b));
		
		//String -----> boolean
		
		String p = "false";
		String q = "true";
		
		boolean bs = Boolean.parseBoolean(q);
		System.out.println(bs);
		
		System.out.println(Boolean.parseBoolean(p));
		
		
		//String to char not possible 
		
		String s = "A"; 
	
		//Scenario 2
		
		// int , char, double, boolean -----> String 
		//primitive to String is Autoboxing
		
		int x = 151;
		String s11 = String.valueOf(x);
		
		char c = 'M';
		String s12 = String.valueOf(c);
		
		double d = 50.20;
		String s13 = String.valueOf(d);
		
		boolean bo = true;
		String s14= String.valueOf(bo); 
		
		System.out.println(s11);
		System.out.println(s12);
		System.out.println(s13);
		System.out.println(s14);
		
		System.out.println();
		
	/*	System.out.println(String.valueOf(x));
		System.out.println(String.valueOf(c));
		System.out.println(String.valueOf(d));
		System.out.println(String.valueOf(bo));  */
		
		//Scenario 3
		// int --- double
		
		int l =10;
		double m = l;
		System.out.println(m);
		
		//double --- int
		
		double d1 = 10.50;
		int e = (int)d1; //typecasting is used convert into int 
		
		System.out.println(e);
		
		

		
		
	}

}
