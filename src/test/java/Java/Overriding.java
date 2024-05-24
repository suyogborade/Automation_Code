package Java;

class Bank
{
	double roi()
	{
		return 0.0;
	}
}

class AxisBank extends Bank 
{

	double axis() 
	{
		return 10.5;
	}

}

class YesBank extends Bank
{
	double Yes()
	{
		return 12.5;
	}
}

public class Overriding {

	public static void main(String[] args) {

		AxisBank ax = new AxisBank(); // 10.5
		System.out.println(ax.axis());

		YesBank ys = new YesBank(); // 12.5
		System.out.println(ys.Yes());

		Bank bn = new Bank(); // 0.0
		System.out.println(bn.roi());

	}

}
