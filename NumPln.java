package Pack;
import java.util.Scanner;
public class NumPln 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n,r=0;
		System.out.println("Enter Number :");
		n=sc.nextInt();
		int num=n;
		while(n!=0)
		{
			r=r*10;
			r=r+n%10;
			n=n/10;
		}
		System.out.println("Reverse :"+r);
		if(num==r)
		{
			System.out.println("Number is Palindrome ");
		}
		else
		{
			System.out.println("Number is Not Palindrome");
		}
	sc.close();
	}
}
