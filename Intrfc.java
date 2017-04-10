package Pack;

public class Intrfc implements Arithoper 
{
	public static void main(String args[])
	{
		Intrfc in=new Intrfc();
		in.add(4,7);
		in.sub(5,2);
		in.mul(8,3);
	}
	public void add(int n1,int n2)
	{
		int c=n1+n2;
		System.out.println(c);
	}
	public void sub(int n1,int n2)
	{
		int d=n1-n2;
		System.out.println(d);
	}
	void mul(int n1,int n2)
	{
		int e=n1*n2;
		System.out.println(e);
	}
}
