import java.util.HashMap;

public class HashMapExample
{
	public static void main(String[] args) {
		

		HashMap<Integer,String> map = new HashMap();
		map.put(1,"abc");
		map.put(5,"Mohan");
		map.put(2,"Raj");
		map.put(3,"vicky");
		map.put(3,"vicky");


		System.out.println(map.size());
		System.out.println(map.containsValue("Raj"));
		System.out.println(map.containsKey(1));
		System.out.println(map);

		System.out.println(map.keySet());
		System.out.println(map.values());

		System.out.println(map.remove(2));
		System.out.println(map);

		System.out.println(map.compute(1,(key,val)->"Nomi"));
		System.out.println(map);
	}
}