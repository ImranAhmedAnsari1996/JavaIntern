package Shruti_Raj;

public class Assignment5 {

	int balance = 1000;
	int debitCount = 0, creditCount = 0, printStatementCount = 0;
	
	void debitAmount() {
		balance -= 200;
		debitCount++;
	}
	void creditAmount() {
		balance += 400;
		creditCount++;
	}
	void printStatement() {
		System.out.println("Remaining balance is " +balance);
		printStatementCount++;
	}
	void printCountInfo() {
		System.out.println("debit method count -> " +debitCount);
		System.out.println("credit method count -> " +creditCount);
		System.out.println("printStatement method count -> " +printStatementCount);
	}
	public static void main (String args [])
	{
		Assignment5 b = new Assignment5();
		b.debitAmount();
		b.creditAmount();
		b.creditAmount();
		b.creditAmount();
		b.printStatement();
		b.printCountInfo();
		
	}
}
