package Pack;
import java.util.Scanner;
public class Wh2 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter Number :");
		n=sc.nextInt();
	
		// TODO Auto-generated method stub
		int c=5;
		while(c>=(n-(n-1)))
		{
			int d=1;
			while(d<=c-1)
			{
				System.out.print(" ");
				d++;
			}
			int e=c;
			while(e<=5)
			{
				System.out.print("*");
				e++;
			}
			System.out.println();
			c--;
		}
		int f=1;
		while(f<=n)
		{
			int d=1;
			while(d<=f-1)
			{
				System.out.print(" ");
				d++;
			}
			int e=f;
			while(e<=5)
			{
				System.out.print("*");
				e++;
			}
			System.out.println();
			f++;	
		}
		sc.close();
	}

}
