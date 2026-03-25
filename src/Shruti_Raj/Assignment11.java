package Shruti_Raj;

public class Assignment11 {
	void findMin(int num1, int num2) {
		if (num1 < num2) {
			System.out.println(num1 + " is smaller between" + num1 + "and"+ num2);
		}
		else {
			System.out.println(num2 + " is smaller between" + num1 + "and"+ num2);

		}
	}
	void findMax(int num1, int num2) {
		if (num1 > num2) {
			System.out.println(num1 + " is bigger between" + num1 + "and"+ num2);
		}
		else {
			System.out.println(num2 + " is bigger between" + num1 + "and"+ num2);
		}
	}
	public static void main(String []args)
	{
		Assignment11 a = new Assignment11();
			
		int num1 = 10;
		int num2 = 17;
		
		a.findMin(num1,num2);
		a.findMax(num1, num2);
	}


}
