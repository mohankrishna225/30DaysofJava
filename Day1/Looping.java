public class Looping
{
	public static void main(String[] args) {
		int m = 5;
		int count =0;
		while(count<5)
		{
			System.out.println("from while loop");
			count++;
		}

		count =0;
		do
		{
			System.out.println("From do while loop");
			count++;
		}
		while(count<5);


		for(count=0;count<m;count++)
		{
			System.out.println("From For loop");
		}


		/*for (type var : array) 
		{ 
    		statements using var;
		}
		*/


	}
}