package Shruti_Raj.Assignment;

public class Assignment3 {
	int balance = 1000;
	void creditAmount() {
		balance = balance + 300;
	}
	void debitAmount() {
		balance = balance - 500;
	}
	void display() {
		System.out.println("Your current balance is "+balance);
	}
	public static void main(String []args) {
		Assignment3 b = new Assignment3();
		b.creditAmount();
		b.debitAmount();
		b.creditAmount();
		b.display();		
	}
 
}
