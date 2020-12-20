class A
{
	public A()
	{
		System.out.println("in A default");
	}

	public A(int i)
	{
		System.out.println("in A int");
	}
}

class B extends A
{
	public B()
	{	
		super(5);
		System.out.println("in B default");
	}

	public B(int i)
	{	
		//super(); //first two cases uncomment this
		super(i); //third and fourth cases uncomment this
		System.out.println("in B int");
	}
}

public class SuperDemo
{
	public static void main(String[] args) {
		
		B obj1 = new B(); //1 
		//in A default
		//in B default

		B obj2 = new B(5);
		//in A default
		//in B int

		B obj3 = new B(5);
		//in A int
 		//in B int

 		B obj4 = new B();
 		//in A int
		//in B default

	}
}