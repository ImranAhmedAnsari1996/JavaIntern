/*
 * Print count of uppercase, lowercase, digit, space and special characters in given input string. [20 mins]
Input : "Te4c_hno Credi3ts"
Output : uppercase -> 2
lowercase -> 11
digit -> 2
space -> 1
special char -> 1
Hint : use Character class static methods.

 */
package Shiksha_Sihotiya;

public class Assignment23 {

	    void getCharCount(String str) 
	    {
	        int upper = 0 , lower = 0 , digit = 0 , space = 0 , special = 0;
	        
	        for (int i = 0; i < str.length(); i++) 
	        {
	            char ch = str.charAt(i);

	            if (Character.isUpperCase(ch)) 
	            {
	                upper++;
	            }
	            else if (Character.isLowerCase(ch)) 
	            {
	                lower++;
	            }
	            else if (Character.isDigit(ch)) 
	            {
	                digit++;
	            } 
	            else if (Character.isWhitespace(ch))
	            {
	                space++;
	            } 
	            else
	            {
	                special++;
	            }
	        }

	        System.out.println("uppercase -> " + upper);
	        System.out.println("lowercase -> " + lower);
	        System.out.println("digit -> " + digit);
	        System.out.println("space -> " + space);
	        System.out.println("special char -> " + special);
	    }

	public static void main(String[] args) {
		
		Assignment23 a23 = new Assignment23();
        a23.getCharCount("Te4c_hno Credi3ts");

	}
	
}
