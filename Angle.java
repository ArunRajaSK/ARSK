package Pack;
import java.util.Scanner;
public class Angle
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int an;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Angle :");
		an=s.nextInt();
		if(an==0)
		{
			System.out.println("Starting Point");
		}
		else if((an>=1)&&(an<=89))
		{
			System.out.println("Acute Angle");
		}
		else if(an==90)
		{
			System.out.println("Right Angle");
		}
		else if((an>=91)&&(an<=179))
		{
			System.out.println("Obtuse Angle");
		}
		else if(an==180)
		{
			System.out.println("Straight Angle");
		}
		else
		{
			System.out.println("INVALID");
		}
		s.close();
	}

}
