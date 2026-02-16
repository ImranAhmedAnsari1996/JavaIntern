/*
 * On user defined range print sum and average of first 3 numbers which is divisible by 5 & 7.
Hint : pass start and end index as a parameter.
Input : Range -> 1 to 210
Output : Numbers are,
35
70
105
Found 3 numbers which are divible by 5 & 7.
sum = 210
Average = 70

 */
package Shiksha_Sihotiya;

public class Assignment16 {

	void findNumbers(int start, int end) 
    {
        int count = 0;
        int sum = 0;

        System.out.println("Numbers are,");

        for (int i = start; i <= end; i++)
        {
            if (i % 5 == 0 && i % 7 == 0)
            {
                System.out.println(i);
                sum += i;
                count++;

                if (count == 3) 
                {  
                    break;
                }
            }
        }

        if (count == 3) {
            int avg = sum / 3;
            
            System.out.println("Found 3 numbers which are divisible by 5 & 7.");
            System.out.println("sum = " + sum);
            System.out.println("Average = " + avg);
        } 
        
        else 
        {
            System.out.println("Less than 3 numbers found in given range.");
        }
    }

    public static void main(String[] args) {
        Assignment16 a16 = new Assignment16();
        a16.findNumbers(1, 210);
    }
}


