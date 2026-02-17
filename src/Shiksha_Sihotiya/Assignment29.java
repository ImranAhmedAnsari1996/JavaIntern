/*
 * write a method to print asscii of Uppercase (A-Z), lowercase(a-z) and all digits (0-9).
 */
package Shiksha_Sihotiya;

public class Assignment29 {

	    void printAsciiGroups()
	    {

	        System.out.println("Uppercase (A-Z):");
	        for (char ch = 'A'; ch <= 'Z'; ch++) 
	        {
	            System.out.println(ch + " -> " + (int)ch);
	        }

	        System.out.println("Lowercase (a-z):");
	        for (char ch = 'a'; ch <= 'z'; ch++)
	        {
	            System.out.println(ch + " -> " + (int)ch);
	        }

	        System.out.println("Digits (0-9):");
	        for (char ch = '0'; ch <= '9'; ch++) {
	            System.out.println(ch + " -> " + (int)ch);
	        }
	    }

	    public static void main(String[] args) {
	    	Assignment29 a29 = new Assignment29();
	        a29.printAsciiGroups();
	    }
}
