class Employee
{
	int eid;
	int salary;
	//String ceo;
	static String ceo;
	//static variables are same for all the objects;
	//Non-static varibles are different for all the objects;
	//Cannot use not-static variable in static block

	static //static Block only in java //when you load a class
	{
		ceo = "Nikitha";
		System.out.println("In static 1");
	}

	public Employee() //when you create an object
	{
		eid =1;
		salary =5000;
		ceo = "Rishi";
		System.out.println("In default COnstructor");

	}

	static
	{
		ceo = "Pavani";
		System.out.println("In static 2");
	}

	public void show()
	{
		System.out.println(eid + ":" + ":" + ceo);
	}

}


//Class data is saved in ClassLoader Memory
//Object data is saved in Heap 



public class StaticDemo
{
	//
	public static void main(String[] args) {
		/*
		Employee mohan = new Employee();

		Employee.ceo = "Deekshith";
		mohan.eid =1;
		mohan.salary =10000;
		//mohan.ceo = "Mahesh";
		mohan.show();
		Employee raj = new Employee();
		raj.eid =2;
		raj.salary =20000;
		//raj.ceo = "Vicky";
		raj.show();


		Employee.ceo = "Nomi";
		raj.show();
		mohan.show();

		*/
		Employee mohan = new Employee();
		mohan.show();

		Employee raj = new Employee();
		raj.show();

	}
}