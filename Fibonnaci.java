package Pack;
import java.util.Scanner;
public class Fibonnaci {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int a=-1,b=1,c,n;
		Scanner s=new Scanner(System.in);
		System.out.println("FIBONNACCI SERIES");
		System.out.println("Enter Number :");
		n=s.nextInt();
		System.out.println("FOR LOOP");
		for(int i=1;i<=n;i++)
		{
			c=a+b;
			System.out.println(+c);
			a=b;
			b=c;
		}
		System.out.println();
		System.out.println("WHILE LOOP");
		int d=-1,e=1,f,j=1;
		while(j<=n)
		{
			f=d+e;
			System.out.println(+f);
			d=e;
			e=f;
			j++;
		}
		System.out.println();
		System.out.println("DO-WHILE LOOP");
		int x=-1,y=1,z,k=1;
		do
		{
			z=x+y;
			System.out.println(+z);
			x=y;
			y=z;
			k++;
		}while(k<=n);
		s.close();
	}

}
