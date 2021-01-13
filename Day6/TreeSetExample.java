import java.util.TreeSet;
import java.util.Iterator;
import java.util.*;
public class TreeSetExample
{
	public static void main(String[] args) {
		
		TreeSet<Integer> set = new TreeSet();

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

		System.out.println(set.first());
		System.out.println(set.last());


		SortedSet treeSet = set.headSet(3,false);
		System.out.println(treeSet);

		SortedSet treeSet1 = set.tailSet(3,true);
		System.out.println(treeSet1);

		System.out.println(set.pollFirst());
		System.out.println(set);

		System.out.println(set.pollLast());
		System.out.println(set);

	}
}