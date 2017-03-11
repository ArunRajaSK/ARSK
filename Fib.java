package Execution;
import java.util.Scanner;
public class Fib {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int a=-1,b=1,c,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number :");
		n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			c=a+b;
			System.out.println(+c);
			a=b;
			b=c;
		}
		sc.close();
	}

}
