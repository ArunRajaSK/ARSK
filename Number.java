package java1;
import java.util.Scanner;
public class Number 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Numbers Program");
		System.out.println(" 1 - Factorial");
		System.out.println(" 2 - Fibonnaci Series");
		System.out.println(" 3 - ArmStrong Number");
		System.out.println(" 4 - Sum Of Digits");
		System.out.println(" 5 - Reverse Number");
		System.out.println("Enter Option :");
		int op=sc.nextInt();
		
		switch(op)
		{
			case 1:System.out.println("Enter Number : ");
				   int nm=sc.nextInt();
				   Fact ft=new Fact();
				   ft.fct(nm);break;
			case 2:System.out.println("Enter Number : ");
					int nb=sc.nextInt();
					Fibser fb=new Fibser();
					fb.fib(nb);break; 
			case 3:System.out.println("Enter Number :");
			       int nr=sc.nextInt();
			       Armstrong as=new Armstrong();
			       as.arm(nr);break;
			case 4:System.out.println("Enter Number :");
		           int nu=sc.nextInt();
		           Sumdigits sd=new Sumdigits();
		           sd.sum(nu);break;   
			case 5:System.out.println("Enter Number :");
	               int ne=sc.nextInt();
	               Revnum rn=new Revnum();
	               rn.rev(ne);break;   
			default:System.out.println("Invalid Option");		
		}
		sc.close();
	}
}