package Shiksha_Sihotiya;

public class Assignment40 {
	
	void pattern_3()
	{
		int count = 1;
		for(int i=1 ; i<=4 ; i++)
		{
			for(int j=1 ; j<=i ; j++)
			{
				System.out.print(count +" ");
				count++;
			}
				System.out.println();
		}

		System.out.println();
	}
	
	public static void main(String[] args) 
	{
		Assignment40 a40 = new Assignment40();
		a40.pattern_3();
	}

}
