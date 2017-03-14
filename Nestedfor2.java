package Pack;

public class Nestedfor2
{
	public static void main(String args[])
	{
		int a,b,c;
		for(a=1;a<=5;a++)
		{
			for(b=1;b<=1;b++)
			{
				System.out.print(" ");
			}
			for(c=a;c<=5;c++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(a=1;a<=5;a++)
		{
			for(b=1;b<=a;b++)
			{
				System.out.print(" ");
			}
			for(c=a;c<=5;c++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(a=1;a<=5;a++)
		{
			for(b=1;b<=a;b++)
			{
				System.out.print(" ");
			}
			for(c=a;c<=a;c++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(a=5;a>=1;a--)
		{
			for(b=1;b<=a;b++)
			{
				System.out.print(" ");
			}
			for(c=a;c<=5;c++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(a=1;a<=5;a++)
		{
			for(b=1;b<=a;b++)
			{
				System.out.print(" ");
			}
			for(c=a;c<=a;c++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
