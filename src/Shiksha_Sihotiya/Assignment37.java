/*write loop inside loop (nested for loop), and print frequency of each character. 
input : aakanksha
a->4
k->2
n->1
s->1
h->1*/
package Shiksha_Sihotiya;

public class Assignment37
{
	void getFreq(String str)
    {
        for(int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);
            int count = 0;

            for(int j = 0; j < str.length(); j++)
            {
                if(ch == str.charAt(j))
                    count++;
            }

            if(str.indexOf(ch) == i)
                System.out.println(ch + " -> " + count);
        }
    }

	public static void main(String[] args) 
	{
		Assignment37 a37 = new Assignment37();
		a37.getFreq("aakanksha");
	}
}
