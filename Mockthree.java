package point;

public class Mockthree
{
	public static void main(String args[])
	{
		int letter=0,ct=1;
		for(char ch='A';ch<='I';ch++)
		{
			letter=letter+1;
		}
		int lt=letter/2;
		int lr=letter%2;
		if(lr==1)
		{
			lt=lt+1;
		}
		int ltr=letter-1;
		for(char st='A',ed='I';st<='E'||ed>='F';st++,ed--)
		{
			for(int i=1;i<ct;i++)
			{
				System.out.print(" ");
			}
			System.out.print(st);
			for(int j=ltr;j>0;j--)
			{
				System.out.print(" ");
			}
			System.out.print(ed);
			System.out.println();
			ltr=ltr-2;
			ct++;
		}
	}
}
