package Java;

public class PassingParamToMainMethod {

	public static void main(String[] a) {
		
		for(String s : a)
		{
			System.out.println(s);
		}

		System.out.println("Number of Values "+ a.length);
	}

}
