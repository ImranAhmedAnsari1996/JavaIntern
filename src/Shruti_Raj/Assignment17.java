package Shruti_Raj;

public class Assignment17 {
	void printLastFive(int start, int end)
	{
		int count = 0;
		System.out.println("Last 5 numbers divisible by 5 are:");
		
		for(int i = end; i >= start; i--)
		{
			if(i % 5 == 0) {
				System.out.println(i);
				count++;
				
				if(count == 5) {
					break;
				}
			}
		}
	}
	public static void main(String args[])
	{
		Assignment17 b = new Assignment17();
		b.printLastFive(10, 500);
		
	}

}
