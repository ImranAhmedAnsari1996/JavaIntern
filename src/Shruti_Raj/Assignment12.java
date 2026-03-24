package Shruti_Raj;

public class Assignment12 {
	void printEvenNumbers(int start, int end) {
		System.out.println("Even numbers are:");
		
		for(int i = start; i <= end; i++)
		{
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
	}
	
	public static void main(String []args)
	{
		Assignment12 b = new Assignment12();
		b.printEvenNumbers(10, 15);
	}

}
