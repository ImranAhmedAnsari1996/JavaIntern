/*
 * On user defined range print return the last numbers which is divisible by 5 and print the answer in main method.
int getLastDivNumber(int startIndex, int endIndex){}
Hint : pass start and end index as a parameter.
Input : Range -> 10 to 498
Output : 495 is the last number which is div by 5 in the given range.
 */
package Shiksha_Sihotiya;

public class Assignment18 {
	
	int getLastDivNumber(int startIndex , int endIndex)
	{
		int i=0;
		for(i=endIndex ; i>=startIndex ;i--)
		{
			if(i%5 == 0)
			{
				break;
			}
		}
		return i;
	}

	public static void main(String[] args) {
		
		Assignment18 a18 = new Assignment18();
		System.out.println(" the lstdivisible number by 5 is "+ new Assignment18().getLastDivNumber(10, 498));
	}
	   
}
