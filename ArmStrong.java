package Pack;
import java.util.Scanner;
public class ArmStrong 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n,r,sum=0;
		System.out.println("Enter Number :");
		n=sc.nextInt();
		int num=n;
		while(n!=0)
		{
			r=n%10;
			n=n/10;
			sum=sum+r*r*r;
			System.out.println(sum);
		}
		System.out.println("Result :"+sum);
		if(sum==num)
		{
			System.out.println(num+" is an Arm Strong Number");
		}
		else
		{
			System.out.println(num+" is not Arm Strong Number");
		}
		sc.close();
	}
}
