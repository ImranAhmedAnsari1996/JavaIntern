package Shruti_Raj;

public class Assignment25 {
	public static void main(String args[])
	{
		String str = "te1ch2no3cre7dits";
		int sum = 0;
		
		for(int i = 0; i < str.length(); i++) {
			
			char ch = str.charAt(i);
			
			if(Character .isDigit(ch)) {
				sum = sum + (ch - '0');
			}
		}
		System.out.println(sum);
	}

}
