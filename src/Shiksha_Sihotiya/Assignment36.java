/*print table for 1 to 5 numbers.*/
package Shiksha_Sihotiya;

public class Assignment36 
{
    void getTable()
    {
        for(int i = 1; i <= 5; i++)
        {
            for(int j = 1; j <= 10; j++)
            {
                System.out.println(i + " x " + j + " = " + (i * j));
            }
            System.out.println();
        }
    }

	public static void main(String[] args) 
	{
		Assignment36 a36 = new Assignment36();
		a36.getTable();
	}
}
