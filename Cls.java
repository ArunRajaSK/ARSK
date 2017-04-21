package java1;

public class Cls extends Clss
{
	public static void main(String args[])
	{
		System.out.println("Class");
		mthd();
		Cls c=new Cls();
		c.obj();
		Clss cl=new Clss();
		cl.Inhrtns();
		c.Inhrtns();
		c.multi();
		String s="Over Loading";;
		c.obj(s);
	}
	public static void mthd()
	{
		System.out.println("  Method");
	}
	void obj()
	{
		System.out.println("Object");
	}
	void Inhrtns()
	{
		System.out.println("Hierarchy, Hybrid");
		System.out.println("Over Ridding");
	}
	void obj(String str)
	{
		String st=str;
		System.out.println(st);
	}
}
