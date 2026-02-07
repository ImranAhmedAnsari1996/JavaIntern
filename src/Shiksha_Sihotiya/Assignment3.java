package Shiksha_Sihotiya;

public class Assignment3 {
	
	int balance = 1000;

    void creditAmt()
    {
        balance = balance + 300;
	System.out.println("Your credited balance is : " + balance);
    }

    void debitAmt()
    {
        balance = balance - 500;
	System.out.println("Your debited balance is : " + balance);
    }

    void display()
    {
        System.out.println("Your current balance is : " + balance);
    }
	
	public static void main(String[] args) {
		
		Assignment3 a3 = new Assignment3();
		a3.creditAmt();
		a3.debitAmt();
		a3.creditAmt();
		a3.display();
	}

}
