import java.util.Scanner;
public class Cangopattern 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Starting Value : ");
		int st=sc.nextInt();
		System.out.println("Enter Ending Value : ");
		int ed=sc.nextInt();
		int flag=0;
		for(int sv=st,ev=ed;sv<=ed&&ev>=st;sv++,ev--)
		{
			if(flag==1&&sv!=ev)
			{
				System.out.println(ev+" "+sv);
			}
			if(flag==0&&sv!=ev)
			{
				System.out.println(sv+" "+ev);
			}
			if(sv==ev)
			{
				System.out.println(sv);
				flag=1;
			}
		}
		sc.close();
	}
}
