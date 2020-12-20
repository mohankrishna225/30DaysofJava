class Casio
{
	public void add(int i, int j)
	{
		System.out.println(i+j);
	}

	public void add(int i, int j,int k)
	{
		System.out.println(i+j+k);
	}

	public void add(double i, double j)
	{
		System.out.println(i+j);
	}
}

public class MethodOverloadingDemo
{
	public static void main(String[] args) {
		Casio obj1 = new Casio();
		obj1.add(5,2);

		Casio obj2 = new Casio();
		obj2.add(1,2,3);

		Casio obj3 = new Casio();
		obj3.add(5.5,2.5);


	}
}