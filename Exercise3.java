package Pack;
import java.util.Scanner;
public class Exercise3 
{
	public static void main(String args[])
	{
		int n,f,w=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number :");
		n=sc.nextInt();
		System.out.println("*  FOR LOOP  *");
		for(f=1;f<=n;f++)
		{
			System.out.println("ARUN RAJA");
		}
		System.out.println();
		System.out.println("*  WHILE LOOP  *");
		while(w<=n)
		{
			System.out.println("ARUN RAJA");
			w++;
		}
		sc.close();
	}
}
