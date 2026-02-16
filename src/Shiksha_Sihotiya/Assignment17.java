/*
 * On user defined range print last 5 numbers which is divisible by 5.
Hint : pass start and end index as a parameter.
Input : Range -> 10 to 500
Output : Last 5 numbers divisible by 5 is :
500
495
490
485
480

 */
package Shiksha_Sihotiya;

public class Assignment17 {

	    void findLastFive(int start, int end) 
	    {
	        int count = 0;

	        System.out.println("Last 5 numbers divisible by 5 is :");

	        for (int i = end; i >= start; i--) 
	        {
	            if (i % 5 == 0) {
	                System.out.println(i);
	                count++;

	                if (count == 5) 
	                {
	                    break;
	                }
	            }
	        }

	        if (count < 5) 
	        {
	            System.out.println("Less than 5 numbers found in given range.");
	        }
	    }

	    public static void main(String[] args) {
	        Assignment17 a17 = new Assignment17();
	        a17.findLastFive(10, 500);
	    }
}

