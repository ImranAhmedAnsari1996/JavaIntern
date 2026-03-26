package Shruti_Raj;

public class Assignment20 {
	static int getCharFreq(String str, char ch) {
		int count = 0;
		
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == ch) {
				count++;
			}
		}
		return count;
	}
	public static void main(String []args)
	{
		String str = "aakanskha";
		char ch = 'a';
		
		int result = getCharFreq(str,ch);
		
		System.out.println("Count of"+ch+ "in"+ str + "is"+ result);
	}

}
