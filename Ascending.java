package point;
import java.util.Scanner;
public class Ascending 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Ascending Order");
		System.out.println("Enter the Number of Elements : ");
		int el=sc.nextInt();
		int nbrs[]=new int[el];
		int agent=1;
		System.out.println("Enter "+el+" elements :");
		for(int i=0;i<nbrs.length;i++)
		{
			nbrs[i]=sc.nextInt();
		}
		int temp;
		for(int i=0;i<nbrs.length;i++)
		{
			for(int j=0;j<nbrs.length-1;j++)
			{
				if(nbrs[j]<nbrs[j+1])
				{
					agent=1;
					temp=nbrs[j];
					nbrs[j]=nbrs[j+1];
					nbrs[j+1]=temp;
				}
				System.out.println("Inner Sort");
				System.out.println();
				for(int l=0;l<nbrs.length;l++)
				{
					System.out.print("\t"+nbrs[l]);
				}
				System.out.println();
			}
			System.out.println("Outer Sort");
			for(int l=0;l<nbrs.length;l++)
			{
				System.out.print("\t"+nbrs[l]);
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("Sorted Order");
		for(int k=0;k<nbrs.length;k++)
		{
			System.out.print("\t"+nbrs[k]);
		}
		System.out.println();
		sc.close();
	}
}
