/*
 * Sum of all the even digits present in a given String. 
input : "te1ch2no3cre7dits"
output : 2
input : "techno"
output : 0
input : "4563"
output : 10
 */
package Shiksha_Sihotiya;

public class Assignment30 {

	    int getEvenDigitSum(String str) 
	    {
	        int sum = 0;

	        for (int i = 0; i < str.length(); i++)
	        {
	            char ch = str.charAt(i);

	            if (Character.isDigit(ch)) 
	            {
	                int digit = ch - '0';

	                if (digit % 2 == 0)
	                {
	                    sum = sum + digit;
	                }
	            }
	        }
	        return sum;
	    }

	    public static void main(String[] args)
	    {
	    	Assignment30 a30 = new Assignment30();

	        System.out.println(a30.getEvenDigitSum("te1ch2no3cre7dits"));
	        System.out.println(a30.getEvenDigitSum("techno"));
	        System.out.println(a30.getEvenDigitSum("4563"));
	    }
}
