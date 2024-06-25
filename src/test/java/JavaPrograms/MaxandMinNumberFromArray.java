package JavaPrograms;

public class MaxandMinNumberFromArray {

	public static void main(String[] args) {
		
		int a []= {20, 40 ,5000, 700 , 903, 830, 1022};
		
		int max = a[0];
		
		for(int i=1; i<a.length; i++)
		{
			if(a[i]>max)
				max=a[i];
		}

		System.out.println("Maximum Number is " + max); 
		
		int b [] = {-1 , 10 ,2 , 903, 202, 90 };
		
		int min = b[0];
		
		for(int j=1; j<b.length; j++)
		{
			if(b[j]< min)
			{
				min=b[j];
			}	
		}
		
		System.out.println("Minimum Number is " + min);
		
	}
	
}
