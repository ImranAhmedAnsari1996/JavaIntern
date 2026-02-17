/*
 * Write a method which returns character of given ascii value.
input : 65
output : A
input : 90
output : Z
input : 55
output : 8 
 */
package Shiksha_Sihotiya;

public class Assignment27 {

	    char getCharFromAscii(int num)
	    {
	        return (char) num;
	    }

	    public static void main(String[] args) 
	    {
	    	Assignment27 a27 = new Assignment27();

	        System.out.println(a27.getCharFromAscii(65));
	        System.out.println(a27.getCharFromAscii(90));
	        System.out.println(a27.getCharFromAscii(55));
	    }
}
