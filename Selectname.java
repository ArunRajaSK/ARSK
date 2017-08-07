package point;
import java.util.*;
public class Selectname
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		TreeSet ts=new TreeSet();
		ts.add("Vignesh");
		ts.add("Karthi");
		ts.add("Arun");
		ts.add("Logesh");
		System.out.println(ts);
		
		HashMap hm=new HashMap();
		hm.put("n1", "Vignesh");
		hm.put("n2", "Karthi");
		hm.put("n3", "Arun");
		hm.put("n4", "Logesh");
		System.out.println(hm);
		System.out.println(hm.keySet());
		System.out.println(hm.entrySet());
		System.out.println(hm.values());
		System.out.println(hm.hashCode());
		System.out.println(hm.isEmpty());
		System.out.println(hm.size());
		
		System.out.println("Enter first character : ");
		char ch=sc.nextLine().charAt(0);
		String name[]={"Arun","Bala","Karthi","Logesh","Venkatesh","Vignesh"};
		String nm;
		
		/*for(int i=0;i<name.length;i++)
		{
			nm=name[i];
			char cr[]=nm.toCharArray();
			for(char c:cr)
			{
				if(c==ch&&count==1)
				{
					System.out.println(nm);
				}
				count=count+1;
			}
		}*/
		for(int i=0;i<name.length;i++)
		{
			nm=name[i];
			char cr[]=nm.toCharArray();
			int count=1;
			for(char c:cr)
			{
				if(c==ch&&count==1)
				{
					System.out.println(nm);
				}
				count=count+1;
			}
		}
		sc.close();
	}
}
