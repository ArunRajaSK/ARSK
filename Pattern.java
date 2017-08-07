package point;
import java.util.Scanner;
public class Pattern 
{
	public static void main(String basic[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number : ");
		int n=sc.nextInt();
		System.out.println();
		System.out.println("Pattern Model 1");
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(i);
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("Pattern Model 2");
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("Pattern Model 3");
		for(int i=1;i<=n;i++)
		{
			for(int k=n;k>i;k--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print(i);
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("Pattern Model 4");
		for(int i=1;i<=n;i++)
		{
			for(int k=n;k>i;k--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("Pattern Model 5");
		for(int i=1;i<=n;i++)
		{
			for(int j=n;j>=i;j--)
			{
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("Pattern Model 6");
		for(int i=1;i<=n;i++)
		{
			for(int k=1;k<i;k++)
			{
				System.out.print(" ");
			}
			for(int j=n;j>=i;j--)
			{
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("Pattern Model 7");
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j<=n;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("Pattern Model 8");
		for(int i=n;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(i);
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("Pattern Model 9");
		for(int i=n;i>=1;i--)
		{
			for(int k=n;k>i;k--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print(i);
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("Pattern Model 10");
		for(int i=1;i<=n;i++)
		{
			for(int k=i;k<n;k++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
				System.out.print(" ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("Pattern Model 11");
		for(int i=1;i<=n;i++)
		{
			for(int j=n;j>i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("*");
				System.out.print(" ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("Pattern Model 12");
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<i;j++)
			{
				System.out.print(" ");
			}
			for(int k=n;k>=i;k--)
			{
				System.out.print("*");
				System.out.print(" ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("Pattern Model 13");
		for(int i=1;i<=n;i++)
		{
			for(int j=n;j>i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("*");
				System.out.print(" ");
			}
			System.out.println();
		}
		for(int i=1;i<n;i++)
		{
			for(int j=1;j<i;j++)
			{
				System.out.print(" ");
			}
			for(int k=n-1;k>=i;k--)
			{
				System.out.print(" ");
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("Pattern Model 14");
		for(int i=1;i<=n;i++)
		{
			for(int k=n-1;k>=i;k--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=(2*i-1);j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("Pattern Model 15");
		for(int i=1;i<=n;i++)
		{
			for(int k=n-1;k>=i;k--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=(2*i);j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		System.out.println();
		sc.close();
	}
}
