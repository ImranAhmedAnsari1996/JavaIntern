package Shiksha_Sihotiya;


public class Assignment1 {
	
	String empName;
	int empAge, empSalary;
	
	void setdata()
	{
		empName = "Shiksha";
		empAge = 20;
		empSalary = 25000;
	}
	
	void display()
	{
		System.out.println("Employee Name : " + empName);
		System.out.println("Employee Age : " + empAge);
		System.out.println("Employee Salary : " + empSalary);
	}
	
	public static void main(String[] args) {
		
		Assignment1 a1 = new Assignment1();
		a1.setdata();
		a1.display();
	}


}
