package Shruti_Raj.Assignment;

import java.util.Scanner;

public class Assignment1 {

	String Emp_name,Emp_mobile;
	int id, salary;
	Scanner sc = new Scanner(System.in);
	
	void getdetails()
	{
		Emp_name= " Shruti raj";
		Emp_mobile=" 5689654123";
		id=101;
		salary=25000;
		System.out.println(" Employee name is "+ Emp_name);
		System.out.println(" Employee id is "+ id);
		System.out.println(" Employee Salary is "+ salary);
		System.out.println(" Employee mobile number is "+ Emp_mobile);
	}
	
	void getdetailsbyyser()
	{
		System.out.println(" Enter Employee Name");
		Emp_name= sc.next();
		System.out.println(" Enter Employee Mobile number ");
		Emp_mobile= sc.next();
		System.out.println(" Enter Employee id");
		id= sc.nextInt();
		System.out.println(" Enter Employee Salary");
		salary=sc.nextInt();
		System.out.println(" Employee name is "+ Emp_name);
		System.out.println(" Employee id is "+ id);
		System.out.println(" Employee Salary is "+ salary);
		System.out.println(" Employee mobile number is "+ Emp_mobile);
	}
	
	public static void main(String[] args) {
		Assignment1 as1= new Assignment1();
		as1.getdetails();
		as1.getdetailsbyyser();
	}
}
