package Java;

public class Reverse_String {

	public static void main(String[] args) {

		String s = "Selenium Testing a Open Source Tool";

		System.out.println(s.length());

		for (int i = s.length() - 1; i >= 0; i--) {
			System.out.print(s.charAt(i));
		}

		System.out.println();
	}
	
	

	


}
