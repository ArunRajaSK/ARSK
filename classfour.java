package Pack;

public class classfour
{
	public static void main(String args[])
	{
		System.out.println("Object Creation");
		classthree c3=new classthree();
		c3.exit();
		ext();
		c3.dsp();
	}
	public static void ext()
	{
		System.out.println("Sub Class");
	}
}
