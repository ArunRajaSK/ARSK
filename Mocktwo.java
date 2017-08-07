package point;

public class Mocktwo 
{
	public static void main(String args[])
	{
		for(int i=1;i<=4;i++)
		{
			for(int j=4;j>i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				if(k<=2)
				{
					System.out.print(k);
				}
				else
				{
					System.out.print("2");
				}
			}
			for(int l=i;l>1;l--)
			{
				if(l<=2)
				System.out.print(l-1);
				else
				System.out.print("2");
			}
			System.out.println();
		}
	}
}
