package Pack;
import java.util.Scanner;
public class Bank 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int n,acno,obl=85000,nbl,amt,ano;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Account Number :");
		acno=s.nextInt();
		if(acno==11106006)
		{
			System.out.println("------------------------");
			System.out.println("**-- NATIONAL BANK --**");
			System.out.println("------------------------");
			System.out.println("Account Number    : "+acno);
			System.out.println("Customer Name     : ARUN RAJA");
			System.out.println("Contact Number    : 9876543210");
			System.out.println("Address           : KODAMBAKKAM , CHENNAI");
			System.out.println("Pincode           : 600024");
			System.out.println("------------------------");
			System.out.println("Avaliable balance :"+obl);
			System.out.println("Tranaction Options ");
			System.out.println(" 1 - Deposit ");
			System.out.println(" 2 - Withdraw ");
			System.out.println(" 3 - Money Transfer ");
			System.out.println(" 4 - Exit ");
			System.out.println("------------------------");
			System.out.println("Option - ");
			n=s.nextInt();
			System.out.println("------------------------");
			switch(n)
			{
				case 1:
					System.out.println("Enter Amount :");
					amt=s.nextInt();
					nbl=obl+amt;
					System.out.println("Deposit Amount      :"+amt);
					System.out.println("Available Balance   :"+nbl);
					System.out.println("------------------------");
				break;
				case 2:
					System.out.println("Enter Amount :");
					amt=s.nextInt();
					nbl=obl-amt;
					System.out.println("Withdraw Amount     :"+amt);
					System.out.println("Available Balance   :"+nbl);
					System.out.println("------------------------");
				break;
				case 3:
					System.out.println("Enter Account No :");
					ano=s.nextInt();
					System.out.println("Enter Amount     :");
					amt=s.nextInt();
					nbl=obl-amt;
					System.out.println("Money transfer from "+acno+" to "+ano);
					System.out.println("Amount Transfered      :"+amt);
					System.out.println("Available Balance   :"+nbl);
					System.out.println("------------------------");
				break;
				case 4:
					System.out.println("Thank You");
					System.out.println("Visit Again");
					System.out.println("------------------------");
				break;
				default:
					System.out.println("Invalid");
				break;
			
			}
		}
		else
		{
			System.out.println("UNAUTHORISED USER");
		}
		s.close();
	}
}
