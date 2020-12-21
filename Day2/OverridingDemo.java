class A
{	
	int i;
	public void show()
	{	

		System.out.println("In A value of i :"+i);
		System.out.println("In A");
	}
}

class B extends A
{	

	//@Override // Instead of Logical error we can specify this to override the parent class
	int i;
	public void show()
	{	

		//super.i=8;
		i = 9;
		super.show(); //calling Super Class(Parent)
		System.out.println("In B value of i:"+i);
		System.out.println("In B");
	}//Child class method will override the parent class
}

public class OverridingDemo
{
	public static void main(String[] args) {
		
		B obj1 = new B();
		obj1.show();
	}
}