/*
 * On user defined range print sum of all the number which is divisible by 3 & 5, and print count of numbers too.
Hint : pass start and end index as a parameter.
Input : Range -> 1 to 70
Output : In the range 1 to 70, calculated sum is 150
         In the range 1 to 70, 4 numbers are divisible by 3 and 5.
Print number 1 to 30 .  which is divible by 3 and 7 .but we want to print start 3 numbers only.
*Assignment - 15 :[30-35 mins]
On user defined range print first 3 numbers which is divisible by 3 & 4.
Hint : pass start and end index as a parameter.
Input : Range -> 10 to 500
Output : First 3 numbers divisible by 3 and 4 is :
12
24
36
 */
package Shiksha_Sihotiya;

public class Assignment14 {
	
	    void sumAndCount(int start, int end)
	    {
	        int sum = 0;
	        int count = 0;

	        for(int i = start; i <= end; i++)
	        {
	            if(i % 3 == 0 && i % 5 == 0)
	            {
	                sum = sum + i;
	                count++;
	            }
	        }

	        System.out.println("In the range " + start + " to " + end + ", calculated sum is " + sum);
	        System.out.println("In the range " + start + " to " + end + ", " + count + " numbers are divisible by 3 and 5.");
	    }

	    void firstThree_3and7(int start, int end)
	    {
	        int count = 0;

	        System.out.println("First 3 numbers divisible by 3 and 7 are:");

	        for(int i = start; i <= end; i++)
	        {
	            if(i % 3 == 0 && i % 7 == 0)
	            {
	                System.out.println(i);
	                count++;

	                if(count == 3)
	                    break;
	            }
	        }
	    }

	    void firstThree_3and4(int start, int end)
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
		
		Assignment14 a14 = new Assignment14();
		a14.sumAndCount(1, 70);
		a14.firstThree_3and4(10, 500);
		a14.firstThree_3and7(1, 30);
	}

}
