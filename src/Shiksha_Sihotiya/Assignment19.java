/*
 * Print all the characters of given string in reverse order. 
input : te ch3no
output : o
               n
       3
         H
         c
         e 
         t  		 

 */
package Shiksha_Sihotiya;

public class Assignment19 {

	 void printReverse(String str)
	    {
	        for (int i = str.length() - 1; i >= 0; i--) 
	        {
	            System.out.println(str.charAt(i));
	        }
	    }

	    public static void main(String[] args) {
	        Assignment19 a19 = new Assignment19();
	        a19.printReverse("te ch3no");
	    }
}
