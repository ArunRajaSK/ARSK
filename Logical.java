package Pack;

public class Logical 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int a=3,b=5,c=2;
		if((a>b)&&(a>c))
		{
			System.out.println("A is big");
		}
		else if(b>c)
		{
			System.out.println("B is big");
		}
		else
		{
			System.out.println("C is big");
		}
		
		int d=3,e=5,f=8;
		if(d>e||d>f)
		{
			System.out.println("D is big");
		}
		else
		{
			System.out.println("E or F is Big");
		}
		
		int g=0;
		if(g!=0)
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}
	}
}
