package Shruti_Raj;

public class Patterns {
	
		void pattern_1() 
		{
			for(int i = 1; i <= 5; i++)
			{
				for(int j = 1; j <= i; j++)
				{
					System.out.print(i+"");
				}
				System.out.println();
			}
		}
		void pattern_2()
		{
			for(int i = 1; i <= 5; i++)
			{
				for(int j = 1; j <= 4; j++)
				{
					System.out.print(i+"");
				}
				System.out.println();
			}
		}
		void pattern_3()
		{
			int count = 1;
			
			for(int i = 1; i <= 4; i++)
			{
				for(int j = 1; j <= i; j++)
				{
					System.out.print(count+" ");
					count++;
				}
				System.out.println();
			}
		}
		void pattern_4()
		{
			char ch = 'A';
			
			for(int i = 1; i <= 4; i++)
			{
				for(int j = 1; j <= i; j++)
				{
					System.out.print(ch+" ");
					ch++;
				}
				System.out.println();
			}
		}
		void pattern_5()
		{
		for(int i = 1; i <= 5; i++)
			{
				for(int j = 1; j <= i; j++)
				{
				if(j %2 == 1)
					System.out.print("*");
				else
					System.out.print("#");
				}
				System.out.println();
			}
		}	
		
		void pattern_6()
		{
			for(int i=0;i<=4;i++)
			{
				if(i%2==0)
				{
					for(int j=1;j<=3;j++)
					{
						if(j%2==0)
						{
							System.out.print(" * ");
						}
						else
						{
							System.out.print("  # ");
						}
					}
					System.out.println();
				}
				else
				{
					for(int j=1;j<=5;j++)
					{
						if(j%2==0)
						{
							System.out.print(" * ");
						}
						else
						{
							System.out.print("  # ");
						}
					}
					System.out.println();
				}
			}
		}
		public static void main(String args[])
		{
			Patterns pt =new Patterns();
			pt.pattern_1();
			pt.pattern_2();
			pt.pattern_3();
			pt.pattern_4();
			pt.pattern_5();
			pt.pattern_6();
		}
	}	
