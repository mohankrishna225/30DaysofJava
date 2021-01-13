import java.util.LinkedHashSet;
import java.util.Iterator;

public class LinkedHashSetExample
{
	public static void main(String[] args) {
		
		LinkedHashSet<Integer> set = new LinkedHashSet();

		set.add(5);
		set.add(2);
		set.add(7);
		set.add(4);
		set.add(1);


		System.out.println(set);

		System.out.println(set.size());
		System.out.println(set.contains(2));
		System.out.println(set.isEmpty());

		Iterator<Integer> iterator = set.iterator();

		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}


	}
}