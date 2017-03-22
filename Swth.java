package Pack;
import java.util.Scanner;
public class Swth 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		char ltr;
		System.out.println("Enter a letter :");
		ltr=s.next().charAt(0);
		if((ltr=='A')||(ltr=='a')||(ltr=='E')||(ltr=='e')||(ltr=='I')||(ltr=='i')||(ltr=='O')||(ltr=='o')||(ltr=='U')||(ltr=='u'))
		{
			System.out.println("Vowel");
		}
		else
		{
			System.out.println("Constant");
		}
		s.close();
	}

}
