final class A
{
	final int DAY=0; //constant  
	public A()
	{
		DAY=10; // error: cannot assign a value to final variable i again i.e can;t redefine
	}

	public final void show()
	{
		System.out.println("In A show()");
	}

}


class B extends A{ // error: cannot inherit from final A since it is final

	public final void show()
	{
		System.out.println("In A show()"); //error: show() in B cannot override show() in A
	}

}

public class FinalDemo //Variables, Methods, Classes
{
	public static void main(String[] args) {
		
		A obj = new A();
		System.out.println(obj.DAY);
	}
}

//remove final from each type and check for errors solved;;;;;