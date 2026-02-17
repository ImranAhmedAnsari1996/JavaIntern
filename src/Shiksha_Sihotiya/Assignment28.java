/*
 * write a method to print all the characters having ascii value from 65 to 100.
output : 
65 -> A
66 -> B 
so on .. 

write a method to print ascii values for character A to Z.
output : 
A -> 65
B -> 66
..
..
Z -> 90
 */
package Shiksha_Sihotiya;

public class Assignment28 {

	    void printAsciiToChar() 
	    {
	        for (int i = 65; i <= 100; i++) 
	        {
	            System.out.println(i + " -> " + (char)i);
	        }
	    }

	    void printCharToAscii() 
	    {
	        for (char ch = 'A'; ch <= 'Z'; ch++) 
	        {
	            System.out.println(ch + " -> " + (int)ch);
	        }
	    }

	    public static void main(String[] args) 
	    {
	    	Assignment28 a28 = new Assignment28();

	        a28.printAsciiToChar();
	        a28.printCharToAscii();
	    }
}
