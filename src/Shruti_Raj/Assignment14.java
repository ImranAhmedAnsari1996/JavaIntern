package Shruti_Raj;

public class Assignment14 {
	void printSumCount(int start, int end)
	{
		int sum = 0;
		int count = 0;
		
		for(int i = start; i <= end; i++)
		{
			if (i % 3 == 0 && i % 5 == 0)
			{
				sum += i;
				count++;
			}
		}
		System.out.println("In the range"+start+" to "+end+",calculated sum is "+ sum);
		System.out.println("In the range"+ start+"to"+end+","+ count +"numbers are divisible by 3 and 5.");
	}
	
	public static void main(String args[])
	{
		Assignment14 b = new Assignment14();
		b.printSumCount(1,70);
	}
}
	