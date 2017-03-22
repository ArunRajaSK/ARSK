package Pack;
import java.util.Scanner;
public class Skip 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int st,ed,n;
		System.out.println("Enter Starting Value :");
		st=sc.nextInt();
		System.out.println("Enter Ending Value :");
		ed=sc.nextInt();
		System.out.println("Enter Value to Skip :");
		n=sc.nextInt();
		System.out.println("Values after skip");
		for(int i=st;i<=ed;i++)
		{
			if(i==n)
			{
				continue;
			}
			System.out.println(i);
		}
		System.out.println(" Finish ");
		sc.close();
	}
}
