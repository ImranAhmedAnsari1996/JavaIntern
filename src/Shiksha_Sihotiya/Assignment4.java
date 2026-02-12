package Shiksha_Sihotiya;

public class Assignment4 {
	
	
		String firstName, lastName, phoneNumber, address;
		int empId, managerId;
		
		void updatePrimaryInfo()
		{
			firstName = "Rohan";
	        	lastName = "Sharma";
	        	empId = 101;
	        	managerId = 201;
	    	}

	    	void updateSecondaryInfo()
	    	{
	        	address = "Indore, MP";
	        	phoneNumber = "+91-9765463742";
	   	 }

	    	void displayPrimaryInfo()
	    	{
	       		System.out.println("First Name : " + firstName);
	       		System.out.println("Last Name  : " + lastName);
	        	System.out.println("Emp Id     : " + empId);
	        	System.out.println("Manager Id : " + managerId);
	    	}

	    	void displayOtherInfo()
	    	{
	        	System.out.println("Address    : " + address);
	        	System.out.println("Phone No   : " + phoneNumber);
	    	}

	    	void displayAllInfo()
	    	{
	        	//System.out.println("First Name : " + firstName);
	        	//System.out.println("Last Name  : " + lastName);
	        	//System.out.println("Emp Id     : " + empId);
	        	//System.out.println("Manager Id : " + managerId);
	        	//System.out.println("Address    : " + address);
	        	//System.out.println("Phone No   : " + phoneNumber);
	    		displayPrimaryInfo();
	    		displayOtherInfo();
	    	}

	    public static void main(String args[])
	    {
	        Assignment4 emp = new Assignment4();

	        emp.updatePrimaryInfo();
	        emp.updateSecondaryInfo();
	        emp.displayPrimaryInfo();
	        emp.displayOtherInfo();
	        emp.displayAllInfo();
	    }
	}

	
	