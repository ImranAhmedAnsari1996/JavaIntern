/*
 * return the difference of Sum of all the odd digits and even digits present in a given String. 
HINT : sum of odd digits - sum of even digits
input : "te1ch2no3cre7dits"
output : 9
input : "4563"
output : -2
 */
package Shiksha_Sihotiya;

public class Assignment31 {

	    int getDigitDifference(String str) 
	    {
	        int oddSum = 0;
	        int evenSum = 0;

	        for (int i = 0; i < str.length(); i++)
	        {
	            char ch = str.charAt(i);

	            if (Character.isDigit(ch)) 
	            {
	                int digit = ch - '0';

	                if (digit % 2 == 0)
	                    evenSum = evenSum + digit;
	                else
	                    oddSum = oddSum + digit;
	            }
	        }
	        return oddSum - evenSum;
	    }

	    public static void main(String[] args) 
	    {
	    	Assignment31 a31 = new Assignment31();

	        System.out.println(a31.getDigitDifference("te1ch2no3cre7dits"));
	        System.out.println(a31.getDigitDifference("4563"));
	    }
	
}
