package Shiksha_Sihotiya;

public class Assignment7 {
	
	String firstName, lastName, address, phoneNumber;
    int empId, managerId;
    
    void updatePrimaryInfo(String fname, String lName, int id, int mngId)
    {
        firstName = fname;
        lastName = lName;
        empId = id;
        managerId = mngId;
    }


    void updateSecondaryInfo(String addr, String phone)
    {
        address = addr;
        phoneNumber = phone;
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
        displayPrimaryInfo();
        displayOtherInfo();
    }

    public static void main(String args[])
    {
        Assignment7 a7 = new Assignment7();

        a7.updatePrimaryInfo("Rohan", "Sharma", 101, 201);
        a7.updateSecondaryInfo("Indore, MP", "+91-9765463742");
        a7.displayPrimaryInfo();
        a7.displayOtherInfo();
        a7.displayAllInfo();
    }
}
