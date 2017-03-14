package Pack;
import java.util.Scanner;
public class Module 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int num,yr;
		System.out.println("Enter Number :");
		num=s.nextInt();
		if(num%2==0)
		{
			System.out.println("EVEN NUMBER");
		}
		else
		{
			System.out.println("ODD NUMBER");
		}
		System.out.println("Enter Year :");
		yr=s.nextInt();
		if(yr%4==0)
		{
			System.out.println("LEAP YEAR");
		}
		else
		{
			System.out.println("ORDINARY YEAR");
		}
		s.close();
	}

}
