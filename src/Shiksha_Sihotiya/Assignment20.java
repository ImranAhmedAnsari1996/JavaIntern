/*
 * Find the given character count from given string. 

input : aakanskha, a
output : Count of a in aakanskha is 4.  		 

hint : 
int getCharFreq(String str, char ch){
     return count;
}

 */
package Shiksha_Sihotiya;

public class Assignment20 {

	    int getCharFreq(String str, char ch)
	    {
	        int count = 0;

	        for (int i = 0; i < str.length(); i++) 
	        {
	            if (str.charAt(i) == ch) 
	            {
	                count++;
	            }
	        }

	        //System.out.println("Count of " + ch + " in " + str + " is " + count + ".");
	        return count;
	    }

	    public static void main(String[] args) 
	    {
	        Assignment20 a20 = new Assignment20();
	       int freq= a20.getCharFreq("aakanskha", 'a');
	       System.out.println(" the occurence of a in String is "+ freq);
	    }
	}    
