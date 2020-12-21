class Student
{
	private int rollno;
	private String name;

	//Getters and Setters;

	public void SetRollno(int r)
	{
		rollno =r;
	}

	public int getRollno()
	{
		return rollno;
	}

	public void Setname(String n)
	{
		name = n;
	}
	public String getName()
	{
		return name;
	}

}

// Encapsulation is Binding data with Methods;
public class EncapsulationDemo
{
	public static void main(String[] args) {
		
		Student s1 = new Student();
		//s1.rollno = 2;
		//s1.name = "Mohan";

		s1.Setname("Mohan");
		System.out.println(s1.getName());

		s1.SetRollno(18);
		System.out.println(s1.getName());

	}
}

