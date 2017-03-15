package Pack;
import java.util.Scanner;
public class Arithopr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n,f,s,t;
		System.out.println("---------------------");
		System.out.println("ARITHMETIC OPERATIONS");
		System.out.println("---------------------");
		System.out.println(" 1 - ADDITION ");
		System.out.println(" 2 - SUBTRACTION ");
		System.out.println(" 3 - MULTIPLICATION ");
		System.out.println(" 4 - DIVISION ");
		System.out.println(" 5 - MODULO ");
		System.out.println("---------------------");
		System.out.println("Enter Option :");
		n=sc.nextInt();
		System.out.println("---------------------");
		switch(n)
		{
			
			case 1:
				System.out.println("Enter First Value :");
				f=sc.nextInt();
				System.out.println("Enter Second Value :");
				s=sc.nextInt();
				t=f+s;System.out.println("ADDITION :"+t);
			break;
			case 2:
				System.out.println("Enter First Value :");
				f=sc.nextInt();
				System.out.println("Enter Second Value :");
				s=sc.nextInt();
				t=f-s;System.out.println("SUBTRACTION :"+t);
			break;
			case 3:
				System.out.println("Enter First Value :");
				f=sc.nextInt();
				System.out.println("Enter Second Value :");
				s=sc.nextInt();
				t=f*s;System.out.println("MULTIPLICATION :"+t);
			break;
			case 4:
				System.out.println("Enter First Value :");
				f=sc.nextInt();
				System.out.println("Enter Second Value :");
				s=sc.nextInt();
				t=f/s;System.out.println("DIVISION :"+t);
			break;
			case 5:
				System.out.println("Enter First Value :");
				f=sc.nextInt();
				System.out.println("Enter Second Value :");
				s=sc.nextInt();
				t=f%s;System.out.println("MODULO :"+t);
			break;
			default:System.out.println("INVALID OPTION");
			break;
		}
		System.out.println("---------------------");
		sc.close();
	}

}
