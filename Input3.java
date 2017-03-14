package Pack;
import java.util.Scanner;
public class Input3 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int regno,c,cpp,java,html,sql,total;
		double percent;
		System.out.println("REG NO  :");
		regno=sc.nextInt();
		System.out.println("C    	:");
		c=sc.nextInt();
		System.out.println("CPP  	:");
		cpp=sc.nextInt();
		System.out.println("JAVA 	:");
		java=sc.nextInt();
		System.out.println("HTML 	:");
		html=sc.nextInt();
		System.out.println("SQL  	:");
		sql=sc.nextInt();
		total=c+cpp+java+html+sql;
		percent=total/5;
		System.out.println("REG NO		:"+regno);
		System.out.println("C			:"+c);
		System.out.println("CPP			:"+cpp);
		System.out.println("JAVA		:"+java);
		System.out.println("HTML		:"+html);
		System.out.println("SQL			:"+sql);
		System.out.println("TOTAL		:"+total);
		System.out.println("PERCENTAGE	:"+percent);
		sc.close();
	}
}
