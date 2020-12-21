abstract class Human //abstract class
{
	public abstract void eat(); //abstract method must be present only in a abstract class
	//but an abstract class can have/not have a abstract method;

	public void walk()
	{

	}

}

class Man extends Human
{
	public void eat()
	{

	}
}

public class AbstractDemo
{
	public static void main(String[] args) {
		
		Human obj = new Man(); //Error: Human is abstract; cannot be instantiated
	    

	}
}