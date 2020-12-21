class Aa
{
	public void show()
	{
	System.out.println("in A");
	}
}
class Bb extends Aa
{
	public void show()
	{
		System.out.println("in B");
	}
	public void config() 
	{
		System.out.println("config");
	}
}
class C extends Aa
{
	public void show()
	{
		System.out.println("in C");
	}
}
public class DynamicDispatchMethodDemo
{
	// compile time and runtime
	public static void main(String[] args)
	{
		//Generally
		Bb obj = new Bb();
		obj.show();
		obj.config();
		
		//but we can also do this referncing the A and object of B
		Aa obj1 = new Bb();  // runtime polymorphism
		obj1.show();
		obj1.config(); //Gives error since Class A doesn;t contains config method


		
		obj1 = new C();
		obj1.show();  // Dynamic Method Dispatch
	}
}