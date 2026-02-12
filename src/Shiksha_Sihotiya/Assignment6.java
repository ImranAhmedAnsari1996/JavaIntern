package Shiksha_Sihotiya;

public class Assignment6 {
	 
	int balance;
	
	void initBalance(int amount)
	{
		balance = amount;
	}
	
	void creditAmt(int amount)
	{
		balance = balance + amount;
	}
	
	void debitAmt(int amount)
	{
		balance = balance - amount;
	}
	
	void display()
	{
		System.out.println("Your current balance is " +balance);
	}
	
	
	public static void main(String[] args) {
		
		Assignment6 a6 = new Assignment6 ();
		
		a6.initBalance(5000);
		a6.creditAmt(2000);
		a6.debitAmt(6500);
		a6.creditAmt(1500);
		a6.display();
	}

}
