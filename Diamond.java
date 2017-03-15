package Pack;
import java.util.Scanner;
public class Diamond 
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n,a,b,c,d;
		System.out.println("Enter Number :");
		n=s.nextInt();
		for(a=1;a<=n;a++)
		{
			for(b=1;b<=a;b++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(c=n;c>=1;c--)
		{
			for(d=1;d<=c;d++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		s.close();
	}

}
