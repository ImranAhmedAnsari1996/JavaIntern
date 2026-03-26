/*print the frequency of all digit characters.

input : AAB2cBB2BAd2ed3dd
output : 
2 -> 3
3 -> 1
*/
package Shiksha_Sihotiya;

public class Assignment34 
{
	void getDigitFreq(String str)
	    {
	        for(int i = 0; i < str.length(); i++)
	        {
	            char ch = str.charAt(i);

	            if(ch >= '0' && ch <= '9' && str.indexOf(ch) == i)
	            {
	                int count = 0;

	                for(int j = 0; j < str.length(); j++)
	                {
	                    if(str.charAt(j) == ch)
	                        count++;
	                }

	                System.out.println(ch + " -> " + count);
	            }
	        }
	    }

	    public static void main(String[] args)
	    {
	        Assignment34 a34 = new Assignment34();
	        a34.getDigitFreq("AAB2cBB2BAd2ed3dd");
	    }
}
