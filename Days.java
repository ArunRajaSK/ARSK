package Pack;
import java.util.Scanner;
public class Days
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int d;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Number :");
		d=s.nextInt();
		switch(d)
		{
		case 1:System.out.println("SUNDAY");break;
		case 2:System.out.println("MONDAY");break;
		case 3:System.out.println("TUESDAY");break;
		case 4:System.out.println("WEDNESDAY");break;
		case 5:System.out.println("THURSDAY");break;
		case 6:System.out.println("FRIDAY");break;
		case 7:System.out.println("SATDAY");break;
		default:System.out.println("INVALID");break;
		}
		s.close();
	}

}
