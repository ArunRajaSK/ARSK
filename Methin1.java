package Pack;
import java.util.Scanner;
public class Methin1 
{
	static int fv,sv,op,ad,sb,ml,dv,md;
	static Scanner sc=new Scanner(System.in);
	public static void main(String args[])
	{
		display();
		option();
	}
	public static void display()
	{
		System.out.println("Arithmetic Operation");
		System.out.println(" 1 - Addtion ");
		System.out.println(" 2 - Subtraction ");
		System.out.println(" 3 - Multiplication ");
		System.out.println(" 4 - Division ");
		System.out.println(" 5 - Modulo ");
		System.out.println("Enter Option :");
		op=sc.nextInt();
	}
	public static void input()
	{
		System.out.println(" Enter 1st Value : ");
		fv=sc.nextInt();
		System.out.println(" Enter 2nd Value : ");
		sv=sc.nextInt();
	}
	public static void option()
	{
		switch(op)
		{
			case 1:input();add();break;
			case 2:input();sub();break;
			case 3:input();mul();break;
			case 4:input();div();break;
			case 5:input();mod();break;
			default:System.out.println("*Invalid*");
		}
	}
	public static void add()
	{
		ad=fv+sv;
		System.out.println(" Addition :"+ad);
	}
	public static void sub()
	{
		sb=fv-sv;
		System.out.println(" Subtraction :"+sb);
	}
	public static void mul()
	{
		ml=fv*sv;
		System.out.println(" Multiplication :"+ml);
	}
	public static void div()
	{
		dv=fv/sv;
		System.out.println(" Division :"+dv);
	}
	public static void mod()
	{
		md=fv%sv;
		System.out.println(" Modulo :"+md);
	}
}
