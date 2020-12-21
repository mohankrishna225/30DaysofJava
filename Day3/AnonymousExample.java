class A
{
	public void show()
	{
		System.out.println("in A Show");
	}
}

class B extends A
{
	public void show()
	{
		System.out.println("I m Best");
	}
}

public class AnonymousExample
{
	public static void main(String[] args) {
		
		A obj = new A()
			{
				public void show()
				{
					System.out.println("I m Best from AnonymousExample");
				}
			};
		obj.show();	

	}
}