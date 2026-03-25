package Shruti_Raj;

public class Assignment8 {
	int balance;
	void initBalance(int amt) {
		balance = amt;
	
System.out.println("Balance has been initialized with" + amt + "rs.");
																																						
	}
	void creditAmt(int amt) {
		balance += amt;
		System.out.println(amt + " rs has been credited.");
	}
	void debitAmt(int amt) {
		if(amt > balance)
			System.out.println("insufficient balance"+ amt + "rs u only have.");
		else {
			balance -= amt;
			System.out.println(amt + "rs has been credited.");
		}
	}
	
	void display() {
		System.out.println("your current balance is" + balance + "rs.");
	}
	public static void main (String args[])
	{
		Assignment8 b = new Assignment8();
		b.initBalance(5000);
		b.creditAmt(2000);
		b.creditAmt(500);
		b.debitAmt(9500);
		b.creditAmt(1500);
		b.debitAmt(6000);
		b.display();
	}
}
