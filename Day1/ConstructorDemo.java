//Constructor is a Member method 
//Same name as the Class Name and
//It return Nothing So no need to specify any return type
//Used to Allocate Memory
//Even if we dont specify/create these constructors by default java itself creates constructors.
//Whenever we create a obj a constructor is called automatically so no need to call it separately
//Constructors with different parameters is nothing but Constructor Overlaoding
class Calc
{
	int num1;
	int num2;
	int result;


	public Calc() //Default Constructor
	{
		num1 = 5;
		num2 = 10;
		System.out.println("Inside Constructor");
	}

	public Calc(int n) //Parameterized Constructor
	{
		num1 = n;
		num2 = n;
	
	}

	public Calc(double m,int n)
	{
		num1 = (int)m; //Since num1 is int we have typecasted here
		num2 = n;
	
	}

}

public class ConstructorDemo
{
	public static void main(String[] args) {
		
		Calc obj1 = new Calc(); //Constructor
		System.out.println(obj1.num1);

		Calc obj2 = new Calc(7);
		System.out.println(obj2.num1);

		Calc obj3 = new Calc(7.5,5);
		System.out.println(obj3.num1);





		
	}
}