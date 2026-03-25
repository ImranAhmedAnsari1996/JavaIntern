package Shruti_Raj;

public class Assignment13 {
	void printNumbers(int start, int end)
	{
		System.out.println("Divisible by 5 & 3 are:");
		
		for(int i = start; i <= end; i++)
		{
			if(i % 3 == 0 && i % 5 == 0)
			{
				System.out.println(i);
			}
		}
	}
	
	public static void main (String [] args)
	{
		Assignment13 b = new Assignment13();
		b.printNumbers(5,40);
	}

}
