class Outer
{
	int a;
	public void show()
	{
		System.out.println("Inside Outer");
	}

}

public class InnerDemo
{
	public static void main(String[] args) {
		
		Outer obj = new Outer();
		obj.show();
	}
}