import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;


public class SetDemo
{
	public static void main(String[] args) {
		
		Set<Integer> values = new HashSet<>();

		values.add(5);
		values.add(56);
		values.add(7);
		values.add(6); //No Duplicates //No Sequence when HashSet is used;

		for(Integer c:values)
		{
			System.out.println(c);
		}

		System.out.println();
		Set<Integer> numbers = new TreeSet<>();

		numbers.add(55);
		numbers.add(68);
		numbers.add(74);
		numbers.add(64); //No Duplicates //Ascending Order
		for(Integer c:numbers)
		{
			System.out.println(c);
		}

	}
}