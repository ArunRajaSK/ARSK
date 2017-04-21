package java1;

public class Revnum 
{
	void rev(int n)
	{
		int r=0;
		while(n!=0)
		{
			r=r*10;
			r=r+n%10;
			n=n/10;
		}
		System.out.println("Reverse : "+r);
	}
}
