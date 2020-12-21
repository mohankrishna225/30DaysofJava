//Types of Interfaces
//1. Normal 
//2. Single abstract method - Functional interface(Java 1.8) Lambda Expression from--> Scala
//3. Marker interface Ex: Serialization

interface Abc 
{
	void show();
	
}

public class LambdaExpression
{
	public static void main(String[] args) {
		
		Abc obj = () -> System.out.println("Im the Best"); //Lambda Expression possible only in Java 1.8

		obj.show();	

		Abc obj1 = new Abc()
		{

			public void show()
			{
				System.out.println("Im better");
			}
		}; //Anonymous Classes
		obj1.show();

	}
}