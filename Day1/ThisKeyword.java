class Calc
{

	int num1;
	int num2;
	int result;

	public Calc(int num1)
	{
		num1 = num1; //left side Instance Variable //Right side is Local Variable
		System.out.println("Here this local variable is shadowing the Instance Variable");
		

	}

	public Calc(int num1,int num2)
	{
		this.num1 = num1;
		this.num2 = num2;

	}
}

public class ThisKeyword
{
	public static void main(String[] args) {
		
		Calc obj2 = new Calc(4);
		System.out.println("num1 value :"+obj2.num1);
		System.out.println();
		Calc obj1 = new Calc(4,5);
		System.out.println(obj1.num1);
		System.out.println(obj1.num2);
	}
}