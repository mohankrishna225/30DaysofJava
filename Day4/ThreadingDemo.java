//extending  a Thread Class 
//implementing runnable() interface since multiple inheritance is not here




class Hi extends Thread
{	
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("Hi");
			try { Thread.sleep(1000); } catch(Exception e){}
		}
	}


}

class Hello extends Thread
{	
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("Hello");
			try { Thread.sleep(1000); } catch(Exception e){}
		}
	}


}

public class ThreadingDemo
{
	public static void main(String[] args) {
		
		Hi obj1 = new Hi();
		Hello obj2 = new Hello();
		obj1.start();
		//try { Thread.sleep(1000); } catch(Exception e){}
		obj2.start();
		
		//obj1.run();
		//obj2.run();
	}
}