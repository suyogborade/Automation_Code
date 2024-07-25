package JavaPrograms;

public class ReverseString {

	public static void main(String[] args) {
		
		String str = "Welcome";
		String pal=str;
		String rev= "";
		
		
	for(int i=str.length()-1; i>=0; i--)
		{
			rev = rev + str.charAt(i);
		}
		System.out.println(rev); 		
		
		if(pal.equals(rev))
		{
			System.out.println(pal + " String is Palindrome ");
		}
		
		else
		{
			System.out.println(pal + " String is not Palindrome ");
		}
	
		
	}

}
