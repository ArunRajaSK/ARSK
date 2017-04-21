package java1;

public class Fibser 
{
	void fib(int n)
	{
		int a=-1,b=1,c;
		for(int i=1;i<=n;i++)
		{
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		}
	}
}
