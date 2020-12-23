//extending  a Thread Class 
//implementing runnable() interface since multiple inheritance is not here
public class ThreadingJoinAlive
{
	public static void main(String[] args) throws Exception{
		
		

		
		Thread t1 = new Thread(() ->
			{
				for(int i=1;i<=5;i++)
					{
						System.out.println("Hi" + Thread.currentThread().getPriority());
						try { Thread.sleep(1000); } catch(Exception e){}
					}
			},"Hi Thread"); //(Runnable, Name)
		Thread t2 = new Thread(() ->

								{
									for(int i=1;i<=5;i++)
									{
										System.out.println("Hello");
										try { Thread.sleep(1000); } catch(Exception e){}
									}
								
								});

		t1.start();
		t2.start();


		System.out.println(t1.getPriority());

		System.out.println(t2.getPriority());

		t1.setPriority(1);
		t2.setPriority(10);

		t2.setPriority(Thread.MIN_PRIORITY);



		System.out.println(t1.getName()); //Thread-0

		System.out.println(t2.getName()); //Thread-1

		t1.setName("Hi chinnu"); //Set the Thread Name
		t2.setName("Hello chinnu");

		System.out.println(t1.getName()); 

		System.out.println(t2.getName());




		System.out.println(t1.isAlive()); //running state or not

		t1.join();
		t2.join(); // It will put the current thread on wait until the thread on which it is called is dead.

		System.out.println(t1.isAlive()); //running state or not

		System.out.println("Bye");


	}
}