package Shruti_Raj;

public class Assignment10 {
	
	void getQuarterMonth(int month)
	{
		if (month < 0)
			 System.out.println("invalid month index, it cannot be negative.");
		 else if(month > 12)
			 System.out.println("invalid month index, it cannot be greater than 12.");
			 else {
				 if (month <= 3) {
					 if(month == 1)
						 System.out.println("Month index 1 is in Q1, its January. ");
					 else if(month == 2)
						 System.out.println("Month index 2 is in Q1, its February.");
					 else
						 System.out.println("Month index 3 is in Q1, its March.");
						 
				 }
				 else if(month <= 6) {
					 if(month == 4)
						 System.out.println("Month index 4 is in Q2, its April.");
					 else if(month == 5)
						 System.out.println("Month index 5 is in Q2, its May.");
					 else
						 System.out.println("Month index 6 is in Q2, its June.");
						 
				 }
				 else if(month <= 9) {
					 if(month == 7)
						 System.out.println("Month index 7 is in Q3, its July.");
					 else if(month == 8)
						 System.out.println("Month index 8 is in Q3, its August.");
					 else
						 System.out.println("Month index 9 is in Q3, its September.");
			 }
				 else {
					 if(month == 10)
						 System.out.println("Month index 10 is in Q4, its October.");
					 else if(month == 11)
						 System.out.println("Month index 11 is in Q4, its November.");
					 else
						 System.out.println("Month index 12 is in Q4, its December.");
				 }
			 }
		
	}
	public static void main(String args[])
	{
		Assignment10 as10= new Assignment10();
		as10.getQuarterMonth(5);
		as10.getQuarterMonth(12);
		as10.getQuarterMonth(-2);
		as10.getQuarterMonth(13);
		as10.getQuarterMonth(6);
		 
	}
}
					 
			



