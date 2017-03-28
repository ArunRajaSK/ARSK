package Execution;
import java.util.Scanner;
public class IncomeTax 
{
	static Scanner sc=new Scanner(System.in);
	static int mp,ai,tx,ded;
	public static void main(String args[])
	{
		annual();
		tax(ai);
		net(tx);
	}
	public static int annual()
	{
		System.out.println("Enter Monthly Income : ");
		mp=sc.nextInt();
		ai=mp*12;
		System.out.println("Annula Income :"+ai);
		return ai;
	}
	public static int tax(int al)
	{
		if(al>=500000&&al<800000)
		{
			tx=al*3/100;
			System.out.println("Income Tax :"+tx);
		}
		else if(al>=800000&&al<1400000)
		{
			tx=al*5/100;
			System.out.println("Income Tax :"+tx);
		}
		else if(al>=1400000&&al<2000000)
		{
			tx=al*8/100;
			System.out.println("Income Tax :"+tx);
		}
		else if(al>=2000000&&al<2500000)
		{
			tx=al*10/100;
			System.out.println("Income Tax :"+tx);
		}
		else if(al>=2500000&&al<3500000)
		{
			tx=al*12/100;
			System.out.println("Income Tax :"+tx);
		}
		else if(al>=3500000&&al<5000000)
		{
			tx=al*15/100;
			System.out.println("Income Tax :"+tx);
		}
		else if(al>=5000000)
		{
			tx=ai*20/100;
			System.out.println("Income Tax :"+tx);
		}
		else
		{
			System.out.println("No Need of Income tax");
		}
		return tx;
	}
	public static void net(int t)
	{
		int np=ai-tx;
		System.out.println("Net Pay :"+np);
	}
}
