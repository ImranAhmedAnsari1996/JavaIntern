package Shruti_Raj;

public class Assignment7 { 
	String firstName, lastName, address,phoneNumber;
	int empID, managerId;
	
	void updatePrimaryInfo(String fname, String lname, int id, int mid) {
		firstName = fname;
		lastName = lname;
		empID = id;
		managerId = mid;
	}
	
	void updateSecondaryInfo(String addr, String phone) {
		address = addr;
		phoneNumber = phone;
	}
	
	void displayPrimaryInfo() {
		System.out.println(firstName + " " + lastName);
		System.out.println(empID + " " + managerId);
	}
	
	void displayOtherInfo() {
		System.out.println(address);
		System.out.println(phoneNumber);
	}
	
	void displayAllInfo() {
		displayPrimaryInfo();
		displayOtherInfo();
	}
	
	public static void main (String args[])
	{
		Assignment7 b = new Assignment7();
		b.updatePrimaryInfo("Shruti","Raj",101,200);
		b.updateSecondaryInfo("Bihar", "9876543212");
		
		b.displayPrimaryInfo();
		b.displayOtherInfo();
		b.displayAllInfo();
	}

}
