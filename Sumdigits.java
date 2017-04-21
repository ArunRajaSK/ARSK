package java1;

public class Sumdigits 
{
	void sum(int n)
	{
		int s=0,d;
		while(n!=0)
		{
			d=n%10;
			s=s+d;
			n=n/10;
		}
		System.out.println("Sum : "+s);
	}
}
