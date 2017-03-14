package Pack;
import java.util.Scanner;
public class Exer 
{
	public static void main(String args[])
	{
		int number;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Number :");
		number=s.nextInt();
		for(int a=1;a<=number;a++)
		{
			if((a%3==0)&&(a%5==0))
			{
				System.out.println(a+"TF");
			}
			else if(a%3==0)
			{
				System.out.println(a+"T");
			}
			else if(a%5==0)
			{
				System.out.println(a+"F");
			}
			else
			{
				System.out.println(+a);
			}
		}
		s.close();
	}
}
