package Pack;
import java.util.Scanner;
public class Exercise4 
{
	public static void main(String args[])
	{
		int a=3,b=5,c=2,yr;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Year :");
		yr=sc.nextInt();
		if(yr%4==0)
		{
			System.out.println("LEEP YEAR");
		}
		else
		{
			System.out.println("ORDINARY YEAR");
		}
		System.out.println("Enter 1st Number :");
		a=sc.nextInt();
		System.out.println("Enter 2nd Number :");
		b=sc.nextInt();
		System.out.println("Enter 3rd Number :");
		c=sc.nextInt();
		if(a>b&&a>c)
		{
			System.out.println("1st Number is Greatest");
		}
		else if(b>c)
		{
			System.out.println("2nd Number is Greatest");
		}
		else
		{
			System.out.println("3rd Number is Greatest");
		}
		sc.close();
	}
}
