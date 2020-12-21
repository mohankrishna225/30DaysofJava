interface Abc
{
	void show();
}

class Implimentor implements Abc
{
	public void show()
	{
		System.out.println("Anything");
	}
}



public class InterafaceDemo
{
	public static void main(String[] args) {
		
	//	Abc obj = new Abc(); // error: Abc is abstract; cannot be instantiated

		Abc obj = new Implimentor();

		obj.show();	

	}
}