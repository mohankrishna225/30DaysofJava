class Counter
{
	int count;
	
	//	public synchronized void increment() 
		public  void increment()// uncomment and check for count is varying 
		{
			count++; //count = count +1;
		}
	
}

public class SyncDemo
{
	public static void main(String[] args) throws Exception {
		
		Counter c = new Counter();
		

		Thread t1 = new Thread(new Runnable()
		{
			public void run()
			{
				for(int i=1;i<=1000;i++)
				{
					c.increment();
				}
			}
		});


				Thread t2 = new Thread(new Runnable()
		{
			public void run()
			{
				for(int i=1;i<=1000;i++)
				{
					c.increment();
				}
			}
		});

		t1.start();
		t2.start();
		
		t1.join(); //wait for t1 to complete the job

		t2.join(); //wait for t1 to complete the job

		System.out.println("count "+ c.count);
	}
}