class Printer
{
	public void show(Integer i)
	{
		System.out.println("Integer");
		System.out.println(i);
	}
	public void show(Number i)
	{
		System.out.println("Number");
		System.out.println(i);
	}
}

public class AbstractionDemo
{
	public static void main(String[] args) {
		

		Printer obj = new Printer();
		obj.show(50.4);
	}
}
