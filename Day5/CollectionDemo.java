//collection
//Collection -->Interface --> List --> ArrayList | Arrays are faster than Collections
//Collections
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo
{
	public static void main(String[] args) throws Exception {
		
		Collection values = new ArrayList();
		values.add(4);
		values.add(5);
		values.add(6);
		values.add(2);
		
		System.out.println(values);

		Iterator it = values.iterator();

		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		


	}
}