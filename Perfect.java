package Pack;

import java.util.Scanner;
public class Perfect 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n,num,sum=0;
		System.out.println("Enter Number :");
		n=sc.nextInt();
			for(int i=1;i<n;i++)
			{
				num=n%i;
				if(num==0)
				{
					System.out.println("I :"+i);
					sum=sum+i;
				}
			}
			System.out.println("Result :"+sum);
			if(sum==n)
			{
				System.out.println("Perfect Number");
			}
			else
			{
				System.out.println("Not a Perfect Number");
			}
			sc.close();
	}
}
