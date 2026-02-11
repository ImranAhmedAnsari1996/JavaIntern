package Shiksha_Sihotiya;

public class Assignment5 {
	
	int bal= 1000, debitcount=0, creditcount=0, printstatementcount=0;
	
	void debitAmt()
	{
		debitcount++;
		bal = bal-200;
	}
	
	void creditAmt()
	{
		creditcount++;
		bal = bal + 400;
	}
	
	void printstatment()
	{
		printstatementcount++;
		System.out.println("remaining balance is : " + bal);
		
	}

	void printcountInfo()
	{
		System.out.println("debit method call count : " + debitcount );
		System.out.println("credit method call count : " + creditcount );
		System.out.println("printstatement method call count : " +printstatementcount );
	}

	public static void main(String[] args) {
		
		Assignment5 a5 = new Assignment5 ();
		a5.debitAmt();
		a5.creditAmt();
		a5.creditAmt();
		a5.creditAmt();
		a5.printstatment();
		a5.printcountInfo();
	}
}
