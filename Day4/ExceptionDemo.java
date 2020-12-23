
//1.7 U can write multiple expections in a single catch


public class ExceptionDemo
{
	public static void main(String[] args) {
		
		try
		{
			int i = 9/5;
			//int j = 9/0;
			//System.out.println(i);
			//System.out.println(j);

			int a[] = new int[6];
			//a[6]=8;
			int k=0;

			int h=0;
			if(h==0)
			{
				throw new MohanException("This is not a possible");
			}

			if(k==0)
			{
				throw new Exception();
			}
			

		}
		catch(MohanException e)
		{
			System.out.println(e.getMessage());
		}

		catch(ArithmeticException | ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Error from multiple catch block Exception");
		}

	
		catch(Exception e)
		{
			System.out.println("Error");
		}
		
		

		finally
		{
			System.out.println("Bye");
		}

		
	}
}

