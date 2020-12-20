class Calc
{
	public int add(int i,int j)
	{
		return i+j;
	}

	public int add(int ...n) //Syntax three dots followed by a local variable name
	{
		int sum=0;
		for(int i:n)
		{
			sum = sum +i;
		}
		return sum;
	}
}
//Variable Arguments
public class VarargsDemo
{
	public static void main(String[] args) {
		Calc obj = new Calc();

		System.out.println(obj.add(4,5,5));
	}
}