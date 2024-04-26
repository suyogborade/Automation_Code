package Java;

public class StringComparison {

	public static void main(String[] args) {

		/*
		 * //Case 1 String s1="welcome";
		 * 
		 * String s2= "welcome";
		 * 
		 * //directing to the same object System.out.println(s1.equals(s2));
		 * System.out.println(s1==s2);
		 */

		// Case 2
		String a1 = new String("welcome");
		String a2 = new String("welcome");

		System.out.println(a1 == a2); // comparing Objects -false becoz creating two different objects
		System.out.println(a1.endsWith(a2)); // comparing values

		// Case 3

		String s1 = "abc";
		String s2 = new String("abc");
		String s3 = s2;

		System.out.println(s1 == s2); // false
		System.out.println(s1.endsWith(s2)); // true

		System.out.println("=========---------===========");

		System.out.println(s1 == s3); // false
		System.out.println(s2 == s3); // true
		System.out.println(s2.equals(s3)); // true

	}

}
