package update;
import java.util.Scanner;
public class Chess
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("-------------------------------");
		System.out.println("** CHESS BOARD **");
		System.out.println("-------------------------------");
		System.out.println("Queen's Position : ");
		int qr=sc.nextInt();
		int qc=sc.nextInt();
		System.out.println("Knight's Position : ");
		int kr=sc.nextInt();
		int kc=sc.nextInt();
		System.out.println("-------------------------------");
		System.out.println("Queen's place  : ("+qr+","+qc+")");
		System.out.println("Knight's place : ("+kr+","+kc+")");
		int qpos=qr+qc;
		int kpos=kr+kc;
		if(qr==kr||qc==kc||qpos==kpos)
			System.out.println("Strike");
		else
		{
			int r=0,c=0;
			if(qpos>kpos)
			{
				r=qr-kr;
				c=qc-kc;
			}
			if(kpos>qpos)
			{
				r=kr-qr;
				c=kc-qc;
			}
			if(r==c)
			{
				System.out.println("Strike");
			}
			else
			{
				System.out.println("Non Strike");
			}
		}
		System.out.println("-------------------------------");
		sc.close();
	}
}
