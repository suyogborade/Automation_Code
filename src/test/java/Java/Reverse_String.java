package Java;

public class Reverse_String {

	public static void main(String[] args) {

		String text = "Selenium Testing a Open Source Tool";

		System.out.println(text.length());

		for (int i = text.length() - 1; i >= 0; i--) {
			System.out.print(text.charAt(i));
		}

		System.out.println();
	}

}
