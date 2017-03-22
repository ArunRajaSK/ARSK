package Pack;
import java.util.Scanner;
public class Dgt 
{
	static int n,rev=0,sum=0;
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number:");
		n=sc.nextInt();
		reverse();
		digit();
		System.out.println("Reverse Number : "+rev);
		System.out.println("Sum of Digits : "+sum);
		sc.close();
	}
	public static void reverse()
	{
		int n1=n;
		while(n1!=0)
		{
			rev=rev*10;
			rev=rev+n1%10;
			n1=n1/10;
		}
	}
	public static void digit()
	{
		int n2=n;
		while(n2!=0)
		{
			int d=n2%10;
			sum=sum+d;
			n2=n2/10;
		}
	}
}
