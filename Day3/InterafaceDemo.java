interface Abc
{
	void show();
}

interface Bcd
{
	void display();
	void show();

}


class Implimentor implements Abc,Bcd
{
	public void show()
	{
		System.out.println("Anything");
	}

	public void display()
	{
		System.out.println("Something");
	}
}

//class Implimentor2 implements



public class InterafaceDemo
{
	public static void main(String[] args) {
		
	//	Abc obj = new Abc(); // error: Abc is abstract; cannot be instantiated

	 	Abc obj1 = new Implimentor();
	 	obj1.show();	 //Anything
		//obj1.display(); //  error: cannot find symbol

		Bcd obj2 = new Implimentor();
		obj2.show(); //Anything
		obj2.display(); //Something

		Implimentor obj = new Implimentor();
		obj.show();	
		obj.display();

		

	}
}