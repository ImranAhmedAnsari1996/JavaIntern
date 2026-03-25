package Shruti_Raj;

public class Assignment15 {
	void printFirstThree(int start, int end) {
		int count = 0;
		
		System.out.println("First three numbrrs divisible by 4 and 3 are:");
		
		for (int i = start; i <= end; i++)
		{
			if (i % 3 == 0 && i % 4 == 0)
			{
				System.out.println(i);
				count++;
				
				if(count == 3) {
					break;
				}
			}
		}
	}
	
	public static void main (String []args)
	{
		Assignment15 b = new Assignment15();
		b.printFirstThree(10,500);
	}

}
