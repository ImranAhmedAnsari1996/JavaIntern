/*print the freq of each uppercase character.
input : aaKaNKshA
K=2
N=1
A=1
hint : charAt , indexOf*/
package Shiksha_Sihotiya;

public class Assignment33 
{
	    void getUpperFreq(String str)
	    {
	        for(int i = 0; i < str.length(); i++)
	        {
	            char ch = str.charAt(i);

	            if(ch >= 'A' && ch <= 'Z' && str.indexOf(ch) == i)
	            {
	                int count = 0;

	                for(int j = 0; j < str.length(); j++)
	                {
	                    if(str.charAt(j) == ch)
	                        count++;
	                }

	                System.out.println(ch + "=" + count);
	            }
	        }
	    }

	    public static void main(String[] args)
	    {
	        Assignment33 a33 = new Assignment33();
	        a33.getUpperFreq("aaKaNKshA");
	    }
}
