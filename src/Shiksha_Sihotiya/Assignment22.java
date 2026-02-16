/*
 * write a method to return total number of digits from the given input.
print the count in main method.

input : aa1kan33ks4h5a
output : total 5 digits are there in given input.

Hint : boolean Character.isDigit(ch)

 */
package Shiksha_Sihotiya;

public class Assignment22 {
	
	    int getDigitCount(String str)
	    {
	        int count = 0;

	        for (int i = 0; i < str.length(); i++) 
	        {
	            char ch = str.charAt(i);
	            if (Character.isDigit(ch)) 
	            {
	                count++;
	            }
	        }
	        return count;
	    }

	public static void main(String[] args) {
		
		Assignment22 a22 = new Assignment22();
		int ans = a22.getDigitCount("aa1kan33ks4h5a");

        System.out.println("total " + ans + " digits are there in given input.");
    }

}
