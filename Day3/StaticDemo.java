@FunctionalInterface
interface Demo
{
	int num=8; //by default in interfaces variables are constant i.e final int num=8;
	void abc();
	static void show()
	//default void show()
	{
		System.out.println("HI");

	}
}



class DemoImp implements Demo
{
	public void abc()
	{
		//num=9;  //error: cannot assign a value to final variable numnum=9;
	}


}

public class StaticDemo
{
	public static void main(String[] args) {
		
		//Generally we need to implement the interface with a class and instantiate an object
		 // for that class but using static with interfaces we can avoid this long process
		//DemoImp obj = new DemoImp();
		//obj.show();

		Demo.show();
	}
}