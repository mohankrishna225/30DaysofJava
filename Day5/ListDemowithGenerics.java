//collection
//Collection -->Interface --> List --> ArrayList | Arrays are faster than Collections
//Collections
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Collections; //Class
import java.util.Comparator;

public class ListDemowithGenerics
{
	public static void main(String[] args) throws Exception {
		
		//List<Integer> values = new ArrayList<Integer>(); //1.5
		List<Integer> values = new ArrayList<>(); //1.7 //Mutable
		values.add(4); //Integer v = new Integer(4);
		values.add(5);
		values.add(6);
		values.add(0,2); //(index,value)

		Collections.sort(values);

		for(int i=0;i<values.size();i++)
		{
			System.out.println(values.get(i));
		}

		Comparator<Integer> c = new Comparator<Integer>() //Anonymous Class 
						{
							public int compare(Integer i,Integer j)
							{
								if(i%10>j%10)
								{
									return 1;
								}
								else
								{
									return -1;
								}
							}

						};

		Comparator<Integer> d = (Integer i,Integer j) -> //Lambda
							{
								return i%10>j%10?1:-1;
							};

		Comparator<Integer> e = (i,j) -> i%10>j%10?1:-1; //Lambda
													

						
						

		Collections.sort(values,c);//Comparator Object can be passed;

		Collections.reverse(values);
		System.out.println("MAX:"+Collections.max(values));
		System.out.println("MIN:"+Collections.min(values));
		System.out.println(values);

		

		for(Integer o: values)
		{
			System.out.println(o);
		}
		


	}
}