class Casio
{
	int num1;
	int num2;
	String operation;

	public Casio()
	{
		num1 = 0;
		num2 = 0;
		System.out.println("default constructor is called");
	}

	public Casio(int i)
	{
		num1 =i;
		num2 =0;
		operation = "Nothing";
		System.out.println(num1 +" is called");
	}

	public Casio(int i,int j)
	{
		num1 = i;
		num2 = j;
		operation = "Nothing";
	}

	public Casio(int i,int j,String op)
	{
		num1 = i;
		num2 = j;
		operation = op;
		System.out.println("int i, intj, String op is Called");
	}


}

public class ConstructorOverloadingDemo
{
	public static void main(String[] args) {

		Casio obj2 = new Casio();
		Casio obj1 = new Casio(5);
		Casio obj3 = new Casio(7,5,"HI");
		


	}
}