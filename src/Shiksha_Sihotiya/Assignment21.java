/*
 * Find the length of the given string excluding space. 
input : prem lata gupta
output : length without space is 13 and space characters are 2. 

 */
package Shiksha_Sihotiya;

public class Assignment21 {

	    void getLengthInfo(String str) 
	    {
	        int charCount = 0;
	        int spaceCount = 0;

	        for (int i = 0; i < str.length(); i++)
	        {
	            if (str.charAt(i) == ' ') 
	            {
	                spaceCount++;
	            } 
	            else
	            {
	                charCount++;
	            }
	        }

	        System.out.println("length without space is " + charCount + " and space characters are " + spaceCount + ".");
	    }

	    public static void main(String[] args)
	    {
	        Assignment21 a21 = new Assignment21();
	        a21.getLengthInfo("prem lata gupta");
	    }
	}

