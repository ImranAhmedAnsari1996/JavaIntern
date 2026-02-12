/*
 * *Assignment - 15 : [30-35 mins]
On user defined range print first 3 numbers which is divisible by 3 & 4.
Hint : pass start and end index as a parameter.
Input : Range -> 10 to 500
Output : First 3 numbers divisible by 3 and 4 is :
12
24
36
 */
package Shiksha_Sihotiya;

public class Assignment15 {

	    void printFirstThree(int start, int end)
	    {
	        int count = 0;

	        System.out.println("First 3 numbers divisible by 3 and 4 is :");

	        for(int i = start; i <= end; i++)
	        {
	            if(i % 3 == 0 && i % 4 == 0)
	            {
	                System.out.println(i);
	                count++;

	                if(count == 3)
	                    break;
	            }
	        }
	    }
	    public static void main(String[] args) {
			
	    	Assignment15 a15 = new Assignment15();
	    	a15.printFirstThree(10, 500);
		}

}
