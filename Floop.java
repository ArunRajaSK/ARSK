package Pack;

public class Floop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int n=5,i,j,k;
	for(i=1;i<=n;i++)
	{
		for(j=1;j<=i;j++)
		{
			System.out.print("*");
		}
		System.out.println();
	}
	for(i=n;i>=1;i--)
	{
		for(j=1;j<=i;j++)
		{
			System.out.print("*");
		}
		System.out.println();
	}
	for(i=n;i>=1;i--)
	{
		for(j=1;j<=i-1;j++)
		{
			System.out.print(" ");
		}
		for(k=n;k>=i;k--)
		{
			System.out.print("*");
		}
		System.out.println();
	}
	for(i=n;i>=1;i--)
	{
		for(j=n;j>i;j--)
		{
			System.out.print(" ");
		}
		for(k=1;k<=i;k++)
		{
			System.out.print("*");
		}
		System.out.println();
	}
	
	}

}
