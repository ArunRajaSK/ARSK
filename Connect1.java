package Pack;
import java.util.Scanner;
public class Connect1 
{	
	static Scanner sc=new Scanner(System.in);
	public static void main(String args[])
	{
		int a,b,c;
		System.out.println("Max >< Min");
		System.out.println("Enter 1st Value - ");
		a=sc.nextInt();
		System.out.println("Enter 2nd Value - ");
		b=sc.nextInt();
		System.out.println("Enter 3rd Value - ");
		c=sc.nextInt();
		int mx=max(a,b,c);
		System.out.println("Maximum : "+mx);
		min(a,b,c);
		Connect1 c1=new Connect1();
		c1.dsply();
		System.out.println(c1.rgrds());
	}
	public static int max(int i,int j,int k)
	{
		int max=i;
		if(j>max)
			max=j;
		if(k>max)
			max=k;
		return max;
	}
	public static void min(int i,int j,int k)
	{
		int min=i;
		if(j<min)
			min=j;
		if(k<min)
			min=k;
		System.out.println("Minimum : "+min);
	}
	void dsply()
	{
		System.out.println("Successfully Executed");
	}
	String rgrds()
	{
		String rgs="THANK YOU";
		return rgs;
	}
}
