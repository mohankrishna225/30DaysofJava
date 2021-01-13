import java.util.TreeMap;

public class TreeMapExample
{
	public static void main(String[] args) {
		

		TreeMap<String,String> map = new TreeMap();
		map.put("aba","Mohan");
		map.put("aaa","Raj");
		map.put("aea","Vikranth");
		map.put("aea","vicky");
		map.put("abc","vicky");

		System.out.println(map);
		System.out.println(map.size());
		System.out.println(map.containsValue("Raj"));
		System.out.println(map.containsKey("aaa"));
		System.out.println(map);

		System.out.println(map.keySet());
		System.out.println(map.values());

		System.out.println(map.remove("aaa"));
		System.out.println(map);

		System.out.println(map.compute("abc",(key,val)->"Nomi"));
		System.out.println(map);



		System.out.println(map.lastEntry());
		System.out.println(map.ceilingKey("aba"));
		System.out.println(map.floorKey("aba"));
		System.out.println(map.firstKey());
		System.out.println(map.lastKey());
		System.out.println(map.replace("aba","bbb"));
		System.out.println(map);
		System.out.println(map.pollFirstEntry());


		System.out.println(map.subMap("aaa",true,"aca",false));
		System.out.println(map.tailMap("aea",true));
	}
}