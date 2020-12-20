public class VariablesDemo
{
	public static void main(String[] args) {


		int num =5;
		System.out.println(num);

		//int num1 = 5.5; // Error since 5.5 is a double by default and can't be stored in int datatype;
		int num1 = (int)5.5;  //Explicit TypeCasting
		System.out.println(num1);

		//float num2 = 5.5; // Error from double to float can't be done
		float num2 = 5.5f;
		System.out.println(num2); 

		long l1 = 5;
		//long l2 = 5000000000000; //Error
		long l3 = 5000000000000l; // You need to specify "l" at the end.....
		System.out.println(l1);
		System.out.println(l3);

		char c = 'A';
		System.out.println(c);
		c = 66;
		System.out.println(c); //prints B
		c++;
		System.out.println(c); //prints C


		double d1 = 5;
		System.out.println(d1); //prints 5.0

		
	}
}