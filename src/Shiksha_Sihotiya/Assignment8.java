package Shiksha_Sihotiya;

public class Assignment8 {
	
	int balance;

    void initBalance(int amt)
    {
        balance = amt;
        System.out.println("Balance has been initialized with " + balance + " rs.");
    }

    void creditAmt(int amt)
    {
        balance = balance + amt;
        System.out.println(amt + " rs has been credited.");
    }

    void debitAmt(int amt)
    {
        if(amt <= balance)
        {
            balance = balance - amt;
            System.out.println(amt + " rs has been debited.");
        }
        else
        {
            System.out.println(
                "In Sufficient balance, your ask is " + amt +
                " rs but you only have " + balance + " rs."
            );
        }
    }

    void display()
    {
        System.out.println("Your current balance is " + balance + " rs.");
    }

	 
	public static void main(String[] args) {
		
		Assignment8 a8 = new Assignment8();
		a8.initBalance(5000);
		a8.creditAmt(2000);
		a8.creditAmt(500);
		a8.debitAmt(9500);
		a8.creditAmt(1500);
		a8.debitAmt(6000);
		a8.display();
	}

}
