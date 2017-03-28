package Execution;
import java.util.Scanner;
public class Person 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String args[])
	{
		int op;
		System.out.println("PERSON DETAILS");
		System.out.println(" 1 - Personal ");
		System.out.println(" 2 - Academics ");
		System.out.println(" 3 - Official ");
		System.out.println(" Enter Option :");
		op=sc.nextInt();
		switch(op)
		{
			case 1:personal();break;
			case 2:academics();break;
			case 3:official();break;
			default:System.out.println("Invalid Option");
		}
	}
	public static void personal()
	{
		System.out.println(" PERSONAL DETAILS ");
		System.out.println("Enter Name :");
		String st=sc.next();
		sc.nextLine();
		System.out.println("Enter Pincode :");
		int pin=sc.nextInt();
		System.out.println(" Name : "+st);
		System.out.println(" Pincode : "+pin);
		switch(pin)
		{
			case 600001:System.out.println(" Parrys");break;
			case 600017:System.out.println(" TNagar");break;
			case 600024:System.out.println(" Kodambakkam");break;
			case 600026:System.out.println(" Vadapalani");break;
			case 600117:System.out.println(" Pallavaram");break;
			default:System.out.println("Invalid");
		}
	}
	public static void academics()
	{
		System.out.println(" ACADEMIC DETAILS ");
		System.out.println("Enter Course :");
		String cr=sc.next();
		sc.nextLine();
		int sem=0;
		if(cr.equals("BA")||cr.equals("BSC")||cr.equals("BCA")||cr.equals("MCA"))
		{
			sem=6;
			System.out.println("Semester : "+sem);
		}
		else if(cr.equals("BE")||cr.equals("BTECH"))
		{
			sem=8;
			System.out.println("Semester : "+sem);
		}
		else if(cr.equals("ME")||cr.equals("MTECH")||cr.equals("MA")||cr.equals("MSC"))
		{
			sem=4;
			System.out.println("Semester : "+sem);
		}
		else
		{
			System.out.println("Inavlid Course");
		}
		int mk,tl=0;
		for(int i=1;i<=sem;i++)
		{
			System.out.println("Enter "+i+" Sem Percentage :");
			mk=sc.nextInt();
			tl=tl+mk;
			if(i==sem)
			{
				int cgpa=tl/sem;
				System.out.println("GCPA :"+cgpa);
			}
		}
	}
	public static void official()
	{
		int bp;
		System.out.println(" OFFICIAL DETAILS ");
		System.out.println("Designation :");
		String dsg=sc.next();
		sc.nextLine();
		switch(dsg)
		{
			case "ASE":bp=23000;System.out.println("Basic Pay :"+bp);np(bp);break;
			case "SE":bp=34000;System.out.println("Basic Pay :"+bp);np(bp);break;
			case "SSE":bp=45000;System.out.println("Basic Pay :"+bp);np(bp);break;
			case "TL":bp=65000;System.out.println("Basic Pay :"+bp);np(bp);break;
			case "AM":bp=85000;System.out.println("Basic Pay :"+bp);np(bp);break;
			case "MNG":bp=100000;System.out.println("Basic Pay :"+bp);np(bp);break;
			case "PM":bp=135000;System.out.println("Basic Pay :"+bp);np(bp);break;
			case "CSO":bp=150000;System.out.println("Basic Pay :"+bp);np(bp);break;
			case "COO":bp=175000;System.out.println("Basic Pay :"+bp);np(bp);break;
			case "CEO":bp=200000;System.out.println("Basic Pay :"+bp);np(bp);break;
			default:System.out.println("Invalid");
		}
	}
	public static void np(int b)
	{
		int al=b*12;
		System.out.println("Annual Income :"+al);
	}
}
