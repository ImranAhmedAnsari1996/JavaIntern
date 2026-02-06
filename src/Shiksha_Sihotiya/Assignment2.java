package Shiksha_Sihotiya;

public class Assignment2 {
	
	int num1 = 10, num2 = 2;
	
	int getadd()
	{
		return num1+num2;
	}
	
	int getsub()
	{
		return num1-num2;
	}
	
	int getmulti()
	{
		return num1*num2;
	}
	
	int getdiv()
	{
		return num1/num2;
	}
	
	void getTotal()
	{
		int total = getadd() + getsub() + getmulti() + getdiv();
		System.out.println("Total : " + total);
	}

	public static void main(String[] args) {
		
		Assignment2 a2 = new Assignment2();
		a2.getTotal();
	}

}
