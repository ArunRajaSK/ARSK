package point;
import java.util.*;
public class CollectionsSet 
{
	public static void main(String args[])
	{
		HashSet hs=new HashSet();
		hs.add("Vignesh");
		hs.add("Venkatesh");
		hs.add("Logesh");
		hs.add("Arun");
		hs.add("Bala");
		hs.add("Karthick");
		System.out.println("HASH SET : "+hs);
		
		LinkedHashSet lhs=new LinkedHashSet();
		lhs.add("Vignesh");
		lhs.add("Venkatesh");
		lhs.add("Logesh");
		lhs.add("Arun");
		lhs.add("Bala");
		lhs.add("Karthick");
		System.out.println("LINKED HASH SET : "+lhs);
		
		TreeSet ts=new TreeSet();
		ts.add("Vignesh");
		ts.add("Venkatesh");
		ts.add("Logesh");
		ts.add("Arun");
		ts.add("Bala");
		ts.add("Karthick");
		System.out.println("TREE SET : "+ts);
		System.out.println("Size : "+ts.size());
		System.out.println(ts.first());
		System.out.println(ts.last());
		System.out.println(ts.iterator());
		System.out.println(ts.pollFirst());
		System.out.println(ts.pollLast());
		System.out.println(ts.descendingIterator());
		System.out.println(ts.spliterator());
		System.out.println(ts.isEmpty());
		
	}
}
