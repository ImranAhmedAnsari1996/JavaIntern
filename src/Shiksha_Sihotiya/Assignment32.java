//Assignment 32: Find count of each character in the given string :input -Technocredits
//logic of the program:
//we need to count of selected character in the string
//we need to run loop so that it will perform same task for all characters in the string using string class index of method.

package Shiksha_Sihotiya;

public class Assignment32
{
	void getcharcount(String str)
	{
		for(int i = 0; i < str.length(); i++)
		{
			char ch = str.charAt(i);
			
			if(str.indexOf(ch)==i)
			{
				int count = 0;
				
				for(int j = 0; j <str.length(); j++)
				{
					if(str.charAt(j) == ch)
                    {
                        count++;
                    }
				}
				
				System.out.println(ch + " -> " + count);
			}
		}
			
	}

	public static void main(String[] args) 
	{
		Assignment32 a32 = new Assignment32();
		 a32.getcharcount("Technocredits");
	}
}
