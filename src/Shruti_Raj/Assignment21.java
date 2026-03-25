package Shruti_Raj;

public class Assignment21 {
	static int countDigits(String str) {
		
		int count = 0;
		for(int i = 0; i < str.length();i++)
		{
			char ch = str.charAt(i);
			
			if(Character.isDigit(ch)) {
				count++;
			}
		}
		return count;
	}
	public static void main(String []args)
	{
		String str = "aa1kan33ks4h5a";
		
		int result = countDigits(str);
		
		System.out.println("total" + result + "digits are there in given input.");
	}

}
