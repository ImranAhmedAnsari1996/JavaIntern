package Shruti_Raj;

public class Assignment18 {
	int getLastDivNumber(int startIndex, int endIndex) {
		
		for (int i = endIndex; i >= startIndex; i--) {
			if(i % 5 == 0) {
				return i;
			}
		}
		return - 1;
	}
	public static void main (String args[])
	{
		Assignment18 b = new Assignment18();
		
		int ans = b.getLastDivNumber(10,498);
		
		System.out.println(ans +" is the last number which is div by 5 in the given range.");
	}
}
