package Shiksha_Sihotiya;


public class Assignment11 {
	
	void findmax(int num1, int num2)
	{
		if(num1>num2)
			System.out.println(num1 + " is bigger between " + num1 + " and " + num2  );
		else
			System.out.println(num2 + " is bigger between " + num1 + " and " + num2 );
	}
	
	void findmin(int num1, int num2)
	{
		if(num1<num2)
			System.out.println(num1 + " is smaller between " + num1 + " and " + num2 );
		else
			System.out.println(num2 + " is smaller between " + num1 + " and " + num2  );
	}


	public static void main(String[] args) {
		
		
		Assignment11 a11 = new Assignment11();
		a11.findmax(10,17);
		a11.findmin(10,17);
	}
	
}
