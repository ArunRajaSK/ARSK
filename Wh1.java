package Pack;
import java.util.Scanner;
public class Wh1 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter Number :");
		n=sc.nextInt();
	
		// TODO Auto-generated method stub
		int a=1;
		while(a<=n-1)
		{
			int b=1;
			while(b<=a)
			{
				System.out.print("*");
				b++;
			}
			System.out.println();
			a++;
		}
		//
		int c=5;
		while(c>=(n-(n-1)))
		{
			int d=1;
			while(d<=c)
			{
				System.out.print("*");
				d++;
			}
			System.out.println();
			c--;
		}
		sc.close();
	}

}
