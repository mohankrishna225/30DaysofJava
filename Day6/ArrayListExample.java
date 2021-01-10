import java.util.ArrayList;

public class ArrayListExample
{	

	public static void main(String[] args) {
		

		//Heterogenous // Without Generics
		ArrayList arr = new ArrayList();
		arr.add(1);
		arr.add("Hi");

		System.out.println(arr);

		//you can't pass primitive data types into Generics
		//With Generics
		ArrayList<Integer> arr1 = new ArrayList();
		arr1.add(1);
		arr1.add(2);
		arr1.add(3);

		System.out.println(arr1.toString());// By default toString() calls since its overwritten
		System.out.println(arr1);

		System.out.println(arr1.size());

		System.out.println(arr1.contains(3));
		System.out.println(arr1.contains(8));


		System.out.println(arr1.remove(2)); //index

		System.out.println(arr.set(0,5)); //get Index Array our of Bounds if you set an index which is not present
		System.out.println(arr);

		System.out.println(arr1.indexOf(2));

		arr1.add(5);
		arr1.add(6);
		arr1.add(5);

		System.out.println(arr1);

		System.out.println(arr1.lastIndexOf(5));
		System.out.println(arr1.indexOf(5));

		arr.addAll(arr1);
		System.out.println(arr);

		arr.retainAll(arr1);
		System.out.println(arr);
		System.out.println();
		System.out.println(arr1);
		System.out.println(arr1.subList(0,3));






	}
	
}