package Pack;

public class Cnstr2 
{
	public static void main(String args[])
	{
		Cnstr2 c2=new Cnstr2();
		int a=5,b=3;
		c2.fl();
		c2.oper(a,b);
	}
	void oper(int c,int d)
	{
		int e=c+d;
		System.out.println(e);
	}
	Cnstr2()
	{
		System.out.println("Title");
	}
	void fl()
	{
		System.out.println("End");
	}
}
