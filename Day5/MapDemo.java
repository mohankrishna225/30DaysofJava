import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo
{
	public static void main(String[] args) {
		
		Map<String,String> map = new HashMap<>(); //Dictionaries //Not Synchronized;

		//Hashtables -> Synchronized;

		map.put("MyName","Mohan");
		map.put("actor","Chinnu");

	//	System.out.println(map.get("actor")); //get(Keys);

		Set<String> keys = map.keySet();

		for(String key: keys)
		{
			System.out.println(map.get(key));
		}


	}
}