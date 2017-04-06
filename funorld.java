package Pack;

public class funorld 
{
	public static void main(String args[])
	{
		System.out.println("Function Overloading");
		funorld f=new funorld();
		int r=f.oper(5,3);
		System.out.println(r);
		String s=f.oper("Arun");
		System.out.println(s);
		char c=f.oper('A');
		System.out.println(c);
	}
	int oper(int a,int b)
	{
		int c=a+b;
		return c;
	}
	String oper(String nm)
	{
		String name=nm;
		return name;
	}
	char oper(char c)
	{
		char ch=c;
		return ch;
	}
}
