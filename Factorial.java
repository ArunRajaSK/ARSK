package Pack;
import java.util.Scanner;
public class Factorial 
{
	public static void main(String args[])
	{
		int n,ff=1,fw=1,fd=1;
		Scanner s=new Scanner(System.in);
		System.out.println("FACTORIAL");
		System.out.println("Enter Number :");
		n=s.nextInt();
		System.out.println("FOR LOOP");
		for(int i=1;i<=n;i++)
		{
			ff=ff*i;
		}
		System.out.println(ff);
		System.out.println();
		System.out.println("WHILE LOOP");
		int j=1;
		while(j<=n)
		{
			fw=fw*j;
			j++;		
		}
		System.out.println(fw);
		System.out.println();
		System.out.println("DO-WHILE LOOP");
		int k=1;
		do
		{
			fd=fd*k;
			k++;
		}while(k<=n);
		System.out.println(fd);
		s.close();
	}
}
