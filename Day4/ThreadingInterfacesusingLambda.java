//extending  a Thread Class 
//implementing runnable() interface since multiple inheritance is not here
public class ThreadingInterfacesusingLambda
{
	public static void main(String[] args) {
		
		

		
		Thread t1 = new Thread(() ->
			{
				for(int i=1;i<=5;i++)
					{
						System.out.println("Hi");
						try { Thread.sleep(1000); } catch(Exception e){}
					}
			});
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
	}
}