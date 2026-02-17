/*
 * Assignment - 26 :  [10 mins]
Write a method which returns ascii value of given character. 
input : 'A'
output : 65
input : 'x'
output : 120
input : ' '
output : 32
input : '.'
output : 46
 */
package Shiksha_Sihotiya;

public class Assignment26 {

	int getAsciiValue(char ch) 
	 {
		return ch;
	 }

	    public static void main(String[] args) 
	    {
	    	Assignment26 a26 = new Assignment26();

	        System.out.println(a26.getAsciiValue('A'));
	        System.out.println(a26.getAsciiValue('x'));
	        System.out.println(a26.getAsciiValue(' '));
	        System.out.println(a26.getAsciiValue('.'));
	    }
	
}
