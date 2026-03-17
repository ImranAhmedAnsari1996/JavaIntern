package Shruti_Raj;
class Assignment2{
	int add(int a,int b) {
		return a + b;
	}
	int sub(int a,int b) {
		return a - b;
	}
	int mul(int a,int b) {
		return a * b;
	}
	int div(int a,int b) {
		return a / b;
	}
	void printTotalAns(int a,int b) {
		int total = add(a,b) + sub(a,b) + mul(a,b) + div(a,b);
		System.out.println("Answer is" +total);
	}
	public static void main(String[] args)
	{
		Assignment2 c = new Assignment2();
		int num1 = 10;
		int num2 = 2;
		
		c.printTotalAns(num1, num2);
	}
}
