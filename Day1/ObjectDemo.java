class Calc
{
	int num1;
	int num2;
	int result;

	public void add()
	{
		
		result = num1 + num2;
		
	}
	
}

public class ObjectDemo
{
	public static void main(String[] args) {
		
		Calc obj1; //first type
		obj1 = new Calc();

		Calc obj2 = new Calc(); //second type
		obj2.num1=3;
		obj2.num2=5;
		System.out.println(obj2.result); // prints zero
		obj2.add();
		System.out.println(obj2.result); // prints 8

	}
}