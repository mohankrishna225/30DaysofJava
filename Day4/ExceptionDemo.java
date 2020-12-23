
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
			a[6]=8;

		}

		catch(ArithmeticException | ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Error from multiple catch block Exception");
		}

		catch(ArrayIndexOutOfBoundsException e)
		{
			
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

