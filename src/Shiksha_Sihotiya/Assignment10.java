package Shiksha_Sihotiya;

public class Assignment10 {
	
	    void printMonthQuarter(int month)
	    {
	        if(month <= 0)
	        {
	            System.out.println("invalid month index, it can't be negative.");
	        }
	        else
	        {
	            if(month > 12)
	            {
	                System.out.println("invalid month index, it can't be greater than 13.");
	            }
	            else
	            {
	                String quarter = "";
	                String monthName = "";

	                if(month <= 3)
	                    quarter = "Q1";
	                else if(month <= 6)
	                    quarter = "Q2";
	                else if(month <= 9)
	                    quarter = "Q3";
	                else
	                    quarter = "Q4";

	    
	                if(month == 1) monthName = "January";
	                else if(month == 2) monthName = "Febuary";
	                else if(month == 3) monthName = "March";
	                else if(month == 4) monthName = "April";
	                else if(month == 5) monthName = "May";
	                else if(month == 6) monthName = "June";
	                else if(month == 7) monthName = "July";
	                else if(month == 8) monthName = "August";
	                else if(month == 9) monthName = "September";
	                else if(month == 10) monthName = "October";
	                else if(month == 11) monthName = "November";
	                else monthName = "December";

	                System.out.println("Month index " + month +
	                        " is in " + quarter + ", its " + monthName + ".");
	            }
	        }
	    }

	    public static void main(String args[])
	    {
	        Assignment10 a10 = new Assignment10();

	        a10.printMonthQuarter(5);
	        a10.printMonthQuarter(2);
	        a10.printMonthQuarter(-3);
	        a10.printMonthQuarter(13);
	    }
	}
