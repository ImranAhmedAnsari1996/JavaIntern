/*
 *Sum of all the digits present in a given String. 

input : "te1ch2no3cre7dits"
output : 13

input : "techno"
output : 0

input : "4563"
output : 18

 */
package Shiksha_Sihotiya;

public class Assignment25 {

	    int getDigitSum(String str) 
	    {
	        int sum = 0;

	        for (int i = 0; i < str.length(); i++)
	        {
	            char ch = str.charAt(i);

	            if (Character.isDigit(ch)) {
	                sum = sum + (ch - '0');   
	            }
	        }
	        return sum;
	    }
	public static void main(String[] args) {
		
		Assignment25 a25 = new Assignment25();
		
		System.out.println(a25.getDigitSum("te1ch2no3cre7dits"));
        System.out.println(a25.getDigitSum("techno"));
        System.out.println(a25.getDigitSum("4563"));
	}
}
