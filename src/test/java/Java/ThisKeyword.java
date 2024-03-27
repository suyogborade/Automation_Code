package Java;

public class ThisKeyword {

	int x,y;
	
/*	void setData(int x, int y) 
	{
		this.x=x;
		this.y=y;
	} */
	
	
	ThisKeyword(int x, int y)
	{
		 this.x=x;
		 this.y=y;
	}
	
	void displayData()
	{
	System.out.println(x);
	System.out.println(y);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//	ThisKeyword th = new ThisKeyword();
	//	th.setData(10, 20);
		
		ThisKeyword th = new ThisKeyword(100,200);
		th.displayData();
		
	}

}
