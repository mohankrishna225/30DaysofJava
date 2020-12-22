//Abstract class -> Define and Declare
//Interface -> declare -> 1.7 
//1.8 can define methods in interfaces
//
@FunctionalInterface //Only one Abstract method in FunctionalInterfaces
interface Demo
{
	void abc(); //This is only abstract one; 
	//public void show() // Generally error: interface abstract methods cannot have body
	default void show() //To remove this error use default interfaces Using this we can declare and define as well;
	{
		System.out.println("In Show");
	}//This default interface method can also be overrided;


}

class DemoImp implements Demo
{
	public void abc()
	{
		System.out.println("in abc");
	}

	public void show()
	{
		System.out.println("I'm new");
	}
}

public class DefaultInterafaceDemo
{
	public static void main(String[] args) {
		Demo obj = new DemoImp();
		obj.abc();
		obj.show();

	}
}
