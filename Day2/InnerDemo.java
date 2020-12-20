class Outer
{
	int a;
	public void show()
	{
		System.out.println("Inside Outer");
	}


	class Inner1
	{
		public void display()
		{
			System.out.println("In display from Inner1");
		}
	}

	//We can Make variables, methods and classes static as well;

	static class Inner
	{
		public void display()
		{
			System.out.println("In display from Inner");
		}
	}

}

//Classes are stored as Outer$Inner.class,Outer$Inner1.class

public class InnerDemo
{
	public static void main(String[] args) {
		
		Outer obj = new Outer();
		obj.show();


		//Object Creation for Inner Classes
		Outer.Inner1 obj1 = obj.new Inner1();
		obj1.display();

		//object creation for Static Inner Class;
		Outer.Inner obj2 = new Outer.Inner();
		obj2.display();
	}
}