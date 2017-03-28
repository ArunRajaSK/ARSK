package Pack;
import java.util.Scanner;
public class MaxMin 
{
	static Scanner s=new Scanner(System.in);
	public static void main(String args[])
	{
		maxmin(ip1(),ip2());
	}
	public static int ip1()
	{
		System.out.println("Enter Value");
		int v1=s.nextInt();
		return v1;
	}
	public static int ip2()
	{
		System.out.println("Enter Value");
		int v2=s.nextInt();
		return v2;
	}
	public static void maxmin(int n1,int n2)
	{
		if(n1>n2)
		{
			System.out.println(n1+" is Maximum");
			System.out.println(n2+" is Minimum");
		}
		else if(n2>n1)
		{
			System.out.println(n1+" is Minimum");
			System.out.println(n2+" is Maximum");
		}
		else
		{
			System.out.println(n1+" = "+n2);
		}
	}
}
