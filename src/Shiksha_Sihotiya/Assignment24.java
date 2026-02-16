/*
 * Print count of uppercase, lowercase, digit, space and special characters in given input string.Just a small thing: In the above program, along with the count of each type of letters, can you also print those letters?
Like, I'm expecting the output as follows:
uppercase -> 2 
TC
lowercase -> 11
echnoredits
digit -> 2
43
space -> 1
special char -> 1
 */
package Shiksha_Sihotiya;

public class Assignment24 {

	    void getCharCount(String str) 
	    {
	    	int upper = 0, lower = 0, digit = 0, space = 0, special = 0;

	        String upperStr = "" , lowerStr = "" , digitStr = "";
	       

	        for (int i = 0; i < str.length(); i++) 
	        {
	            char ch = str.charAt(i);

	            if (Character.isUpperCase(ch)) 
	            {
	                upper++;
	                upperStr += ch;
	            } 
	            else if (Character.isLowerCase(ch))
	            {
	                lower++;
	                lowerStr += ch;
	            } 
	            else if (Character.isDigit(ch)) 
	            {
	                digit++;
	                digitStr += ch;
	            } 
	            else if (Character.isWhitespace(ch)) 
	            {
	                space++;
	            } 
	            else {
	                special++;
	            }
	        }

	        System.out.println("uppercase -> " + upper);
	        System.out.println(upperStr);

	        System.out.println("lowercase -> " + lower);
	        System.out.println(lowerStr);

	        System.out.println("digit -> " + digit);
	        System.out.println(digitStr);

	        System.out.println("space -> " + space);
	        System.out.println("special char -> " + special);
	    }

	public static void main(String[] args) {
		
		Assignment24 a24 = new Assignment24();
		a24.getCharCount("Te4c_hno Credi3ts");
	}
}
