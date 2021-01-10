import java.util.LinkedList;

public class LinkedListExample
{
	public static void main(String[] args) {
		
		LinkedList<Integer> list = new LinkedList();

		list.add(1);
		list.add(2);
		list.add(2,3); // (index,element) indexing is like counter in LinkedList
 		
 		System.out.println(list.contains(3));
		System.out.println(list);

		LinkedList<Integer> list1 = (LinkedList<Integer>) list.clone(); ///we need to typecast from Object to LinkedList type
		System.out.println(list1);

		System.out.println(list.size());

		System.out.println(list.getFirst());
		System.out.println(list.getLast());

		list.addLast(45);
		System.out.println(list);
		list.addFirst(52);
		System.out.println(list);

		System.out.println(list.removeFirstOccurrence(3));
		list.add(1,3);
		list.add(2,3);
		System.out.println(list);
		System.out.println(list.removeLastOccurrence(3));
		System.out.println(list);


		System.out.println(list.peek());
		System.out.println(list);
		System.out.println(list.poll());
		System.out.println(list.pollLast());
		System.out.println(list);

	

	}

}