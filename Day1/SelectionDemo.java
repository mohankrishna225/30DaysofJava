public class SelectionDemo
{
	public static void main(String[] args) {
		int m=0;
		if(m==0)
		{
			System.out.println("Neither Even Nor Odd");
		}
		else if(m%2==0)
		{
			System.out.println("Even");
		}
		else
		{
			System.out.println("Odd");
		}



		int i=3;
		int j;
		if(i<5)
		{
			j=6;
		}
		else
		{
			j=7;
		}

		System.out.println(j);


		j = i<5?1:2; //Ternary Operator
		System.out.println(j);


	}
}