package Execution;
import java.util.Scanner;
public class Star 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int i,j,k;
		System.out.print("Number - ");
		int n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			for(j=n-1;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(k=1;k<=(2*i-1);k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(i=n;i>=1;i--)
		{
			for(j=n-1;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(k=2*i;k>1;k--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
	}
}
