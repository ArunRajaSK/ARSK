package Pack;
import java.util.Scanner;
public class Employee 
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int eid,bp,da,cca,hra,pf,ins,all,ded,gp,np,tx,ai;
		String enm,cnm;
		System.out.println("EMPLOYEE DETAILS");
		
		System.out.println("Employee ID :");
		eid=s.nextInt();
		
		System.out.println("Employee Name :");
		enm=s.next();
		s.nextLine();
		
		System.out.println("Company Name :");
		cnm=s.next();
		s.nextLine();
		
		System.out.println("Basic Pay :");
		bp=s.nextInt();
		
		da=bp*12/100;
		cca=bp*10/100;
		hra=bp*14/100;
		pf=bp*15/100;
		ins=bp*10/100;
		all=da+cca+hra;
		ded=pf+ins;
		gp=bp+all;
		np=gp-ded;
		tx=gp*13/100;
		ai=gp*12;
		s.close();
		System.out.println("--------------------------");
		System.out.println("EMPLOYEE ID      :"+eid);
		System.out.println("EMPLOYEE NAME    :"+enm);
		System.out.println("COMPANY NAME     :"+cnm);
		System.out.println("BASIC PAY        :"+bp);
		System.out.println("DA               :"+da);
		System.out.println("CCA              :"+cca);
		System.out.println("HRA              :"+hra);
		System.out.println("PF               :"+pf);
		System.out.println("INSURANCE        :"+ins);
		System.out.println("ALLOWANCE        :"+all);
		System.out.println("DEDUCTION        :"+ded);
		System.out.println("GROSS PAY        :"+gp);
		System.out.println("NET PAY          :"+np);
		System.out.println("TAX              :"+tx);
		System.out.println("ANNUAL INCOME    :"+ai);
	}
}
