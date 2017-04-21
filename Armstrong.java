package java1;

public class Armstrong 
{
	void arm(int n)
	{
		int d,s=0;
		while(n!=0)
		{
			d=n%10;
			s=s+(d*d*d);
			n=n/10;
		}
		System.out.println("Arm Strong : "+s);
	}
}
