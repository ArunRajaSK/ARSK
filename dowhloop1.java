package Pack;
import java.util.Scanner;
public class dowhloop1 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter Number :");
		n=sc.nextInt();
		int a=1;
		do
		{	
			int b=a,c=1;
			do
			{
				
				System.out.print("*");
				c++;
			}while(c<=a);
			do
			{	
				
				System.out.print(" ");
				b++;
			}while(b<=5);
			System.out.println();
			a++;
		}while(a<=n);
		sc.close();
	}
}
