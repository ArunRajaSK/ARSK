package Pack;
import java.util.Scanner;
public class fornum {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number:");
		n=sc.nextInt();
		
		for(int a=1;a<=n;a++)
		{
			for(int b=1;b<=a;b++)
			{
				System.out.print(+b);
			}
			System.out.println();
		}
		
		for(int a=1;a<=n;a++)
		{
			for(int b=1;b<=a;b++)
			{
				System.out.print(+a);
			}
			System.out.println();
		}
		
		for(int a=n;a>=1;a--)
		{
			for(int b=1;b<=a;b++)
			{
				System.out.print(+b);
			}
			System.out.println();
		}
		
		for(int a=n;a>=1;a--)
		{
			for(int b=1;b<=a;b++)
			{
				System.out.print(+a);
			}
			System.out.println();
		}
		sc.close();
	}

}
