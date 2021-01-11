import java.util.Vector;
import java.util.ListIterator;
public class VectorExample
{
	public static void main(String[] args) {
		
		Vector<Integer> vector = new Vector();
		vector.ensureCapacity(20);
		vector.add(3);
		vector.add(4);
		vector.add(2);

		System.out.println(vector);
		System.out.println(vector.size());
		System.out.println(vector.contains(3));

		ListIterator<Integer> list = vector.listIterator();

		while(list.hasNext())
		{
			System.out.println(list.next());
		}

		System.out.println();
		while(list.hasPrevious())
		{
			System.out.println(list.previous());
		}




	}
}