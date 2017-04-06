package Pack;

public class funorrd2 extends funorrd1 
{
	public static void main(String args[])
	{
		funorrd2 f=new funorrd2();
		f.dsply();
		int n=f.dsply(3);
		System.out.println(n);
	}
	void dsply()
	{
		super.dsply();
		System.out.println("Function Overridding - 2");
	}
	int dsply(int num)
	{
		int n=num;
		return n;
	}
}
