/*return "Upper" if uppercase frequency is higher than lowercase frequency other return "lower".
if both having same freqency then return "same".
input : teChnOcreDits
output : lower*/
package Shiksha_Sihotiya;

public class Assignment35 
{
	String checkFreq(String str)
    {
		String str1="";
        int upper = 0, lower = 0;

        for(int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);

            if(Character.isUpperCase(ch))
            {
            	upper++;
            }
            else if(Character.isLowerCase(ch))
            {
            	lower++;
            }
        }
        if(upper>lower)
        {
        	str1= "upper";
        }
        else if(lower>upper)
        {
        	str1="lower";
        }
        else
        {
        	str1="same";
        }
        return str1;
    }
	
	public static void main(String[] args) 
	{
		
		Assignment35 a35 = new Assignment35();
		String result = a35.checkFreq("teChnOcreDits");
		System.out.println("result is " + result+ " frequency ");
	}

}
