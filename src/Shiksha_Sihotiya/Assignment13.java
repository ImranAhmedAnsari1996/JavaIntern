/*
 Assignment - 13 : [20 mins]
1. On user defined range print all numbers which are divisible by 5 and divisible by 3.
Hint : pass start and end index as a parameter.
Input : Range -> 5 to 40
Output : Divisible by 5 & 3, numbers are:
15
30
 */
package Shiksha_Sihotiya;

public class Assignment13 {
	
	void printnumber(int start , int end)
	{
		System.out.println("Divisible by 5 & 3, number are:");
		
		for(int i=start; i<=end ; i++)
		{
			if(i%5 == 0 && i%3 == 0)
				System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		
		Assignment13 a13 = new Assignment13();
		a13.printnumber(5,40);
	}

}
