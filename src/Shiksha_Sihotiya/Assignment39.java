package Shiksha_Sihotiya;

public class Assignment39 
{
	void pattern_2()
	{
		for(int i=1 ; i<=5 ; i++)
		{
			for( int j=1 ; j<=i ; j++)
			{
				System.out.print( j +" ");
			}
				System.out.println();
		}
	}
	public static void main(String args[])
	{
		Assignment39 a39 = new Assignment39();
		a39.pattern_2();
	}
} 


