

public class ToString
{
	public static void main(String[] args) {
		
		Student1 s1 = new Student1(11,"Mohan");

		//System.out.println(s1);
		System.out.println(s1.toString());

	}
}


class Student1 extends Object
{
	int rollno;
	String name;

	public Student1(int rollno, String name)
	{
		this.rollno = rollno;
		this.name = name;

	}


}


class Student
{
	int rollno;
	String name;

	public Student(int rollno, String name)
	{
		this.rollno = rollno;
		this.name = name;

	}

	//overriding default tostring name;
	public String toString()
	{
		return rollno + ":" + name;
	}

}