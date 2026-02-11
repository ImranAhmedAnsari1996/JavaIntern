package Shiksha_Sihotiya;

public class Assignment9 {
	
	   	void printGrade(int score)
	    {
	        if(score > 90 && score <= 100)
	            System.out.println("A+");

	        else if(score > 80 && score <= 90)
	            System.out.println("A");

	        else if(score > 70 && score <= 80)
	            System.out.println("B+");

	        else if(score > 60 && score <= 70)
	            System.out.println("B");

	        else if(score >= 50 && score <= 60)
	            System.out.println("C");

	        else if(score >= 0 && score < 50)
	            System.out.println("work harder");

	        else
	            System.out.println("Invalid score");
	    }
	
	public static void main(String[] args) {
		
		Assignment9 a9 = new Assignment9();
		a9.printGrade(92);
		a9.printGrade(76);
		a9.printGrade(23);
		a9.printGrade(-19);
		a9.printGrade(102);
	}

}
