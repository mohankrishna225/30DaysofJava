class Calc  //Super, Parent, Base
{
	public int add(int ...n)
	{
		int sum=0;
		for(int i:n)
		{
			sum+=i;
		}
		return sum;
	}
}

class CalcAdv extends Calc //Sub, Child, Derived
{
		
		public int sub(int i,int j)
		{
			return i-j;
		}	
}

class CalcVeryAdv extends CalcAdv
{
	public int mul(int i,int j)
	{
		return i*j;
	}
}

public class InheritanceDemo
{
	public static void main(String[] args) {
		CalcVeryAdv obj1 = new CalcVeryAdv();
		System.out.println(obj1.add(4,5)); //SuperClass
		System.out.println(obj1.sub(4,5)); //SubClass
		System.out.println(obj1.mul(4,5));

	}

}