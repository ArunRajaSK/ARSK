package point;
import java.util.*;
public class Searching
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Search an Element in an Array");
		System.out.println("Enter Number of element(s) : ");
		int el=sc.nextInt(),set=0;
		int nbrs[]=new int[el];
		System.out.println("Enter "+el+" element(s)");
		for(int i=0;i<nbrs.length;i++)
		{
			nbrs[i]=sc.nextInt();
		}
		System.out.println("Enter Search element : ");
		int sr=sc.nextInt();
		for(int i=0;i<nbrs.length;i++)
		{
			if(nbrs[i]==sr)
			{
				System.out.println("Elements Found : "+nbrs[i]);
				set=1;
			}
		}
		if(set==0)
		{
			System.out.println("Element Not Found");
		}
	}
}
