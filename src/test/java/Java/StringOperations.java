package Java;

public class StringOperations {

	public static void main(String[] args) {

		String s = "welcome";
		// String s = new String("welcome");

		// length() - returns length of the String
		System.out.println(s.length());

		// Concat() - Joining two strings
		String s1 = "welcome";
		String s2 = "to Java";
		String s3 = "automation";

		System.out.println(s1.concat(s2));
		System.out.println(s1.concat(s2).concat(s3));

		System.out.println(s1 + s2 + s3);

		// trim() - remove right and left space
		s = "     automation      ";

		System.out.println(s.length()); // 21
		System.out.println(s.trim().length()); // 10

		// charAt() - returns a single char based on index we passed
		// index count start from 0

		s = "welcome";

		System.out.println(s.charAt(2)); // l
		System.out.println(s.charAt(5)); // m

		// contains() - returns boolean i.e. true / false

		System.out.println(s.contains("wel")); // true
		System.err.println(s.contains("come")); // true
		System.out.println(s.contains("Welc")); // false

		// equals() , equalIgnoreCase() - compare two strings

		s1 = "WELCOME";
		s2 = "welcome";

		System.out.println(s1.equals(s2)); // false
		System.out.println(s1.equalsIgnoreCase(s2)); // true

		// replace() - replace single/ multiple characters in String

		s = "welcome to selenium java with automation selenium testing training";

		System.out.println(s.replace('s', 'y'));
		System.out.println(s.replace("selenium", "Python"));

		// substring() - to extract substring from the main string
		s = "welcome";

		System.out.println(s.substring(0, 4)); // welc
		System.out.println(s.substring(1, 5)); // elco

		// split() - divide the string into multiple part using delimiter

		s = "Suyog@gmail.com";

		String a[] = s.split("@");
		System.out.println(a[0]);
		System.out.println(a[1]);

		// toUpparCase(), toLowerCase()

		s = "welCOME";

		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());

	}

}
