interface Writer
{
	//this is public abstract by default no need to specify
	void write();
}

class Pen implements Writer
{
	public void write()
	{
		System.out.println("Im a Pen");
	}
}

class Pencil implements Writer
{
	public void write()
	{
		System.out.println("Im a Pencil");
	}

}

class Kit
{
	public void doSomething(Writer p)
	{
		p.write();
	}
}

public class MultipleInheritance
{
	public static void main(String[] args) {
		
		Kit k = new Kit();
		Writer p = new Pen();

		Writer pc = new Pencil();

		k.doSomething(p);

	}
}