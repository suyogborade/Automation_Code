package Java;

public class DataConversionMethods {

	public static void main(String[] args) {
		
		//String ----> integer
		
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
		
		
		// int , char, double, boolean -----> String
		
		int x = 151;
		char c = 'M';
		double d = 50.20;
		boolean bo = true;
		
		System.out.println(String.valueOf(x));
		System.out.println(String.valueOf(c));
		System.out.println(String.valueOf(d));
		System.out.println(String.valueOf(bo));

	}

}
