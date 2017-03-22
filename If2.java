package Pack;
import java.util.Scanner;
public class If2 
{
	public static void main(String args[])
	{
		
	}
	public void oper()
	{
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter Age :");
		n=sc.nextInt();
		if(n>=18)
		{
			if(n>=60)
			{
				System.out.println("Senior Citizen");
			}
			else
			{
				System.out.println("Eligible Citizen");
			}
		}
		else if(n>0)
		{
			System.out.println("Not Eligible");
		}
		else
		{
			System.out.println("Invalid");
		}
		sc.close();
	}
}
