//collection
//Collection -->Interface --> List --> ArrayList | Arrays are faster than Collections
//Collections
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class ListDemo
{
	public static void main(String[] args) throws Exception {
		
		List values = new ArrayList();
		values.add(4); //Integer v = new Integer(4);
		values.add(5);
		values.add(6);
		values.add(0,2); //(index,value)

		values.add(4,"Mohan");
		
		System.out.println(values);

		for(int i=0;i<values.size();i++)
		{
			System.out.println(values.get(i));
		}

		for(Object o: values)
		{
			System.out.println(o);
		}
		


	}
}