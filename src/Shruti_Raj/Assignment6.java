package Shruti_Raj;

public class Assignment6 {
	int balance;
	
	void intBalance(int amount) {
		balance = amount;
	}
	void creditAmount(int amount) {
		balance += amount;
	}
	void debitAmount(int amount) {
		balance -= amount;
	}
	void display() {
		System.out.println("Your current balance is" +balance);
	}
	public static void main (String args[])
	{
		Assignment6 b = new Assignment6();
		b.creditAmount(2000);
		b.debitAmount(6500);
		b.creditAmount(1500);
		b.display();
	}
}
