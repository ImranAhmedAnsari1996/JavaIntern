package Shiksha_Sihotiya;

public class Assignment12 {
	
	void printeven(int start , int end)
	{
		System.out.println("Even number are :");
		
		for(int i=start; i<=end ; i++)
		{ 
			if(i%2 == 0)
				System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		
		Assignment12 a12 = new Assignment12();
		a12.printeven(10,15);
	}

}
