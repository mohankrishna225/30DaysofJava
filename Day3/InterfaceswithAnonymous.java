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




public class InterfaceswithAnonymous
{
	public static void main(String[] args) {
		
	Abc obj = new Abc() // error: Abc is abstract; cannot be instantiated
		{
			public void show()
			{
				System.out.println("I'm the best");
			}
		};
	obj.show();
		



	 	
		

		

	}
}