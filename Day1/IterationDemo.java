public class IterationDemo
{
	public static void main(String[] args) {
		int rows = 5;
		int num=1;
        
        for (int i = 1; i <= rows; i++)
        {
            for (int j = 1; j <= i; j++)
            {	
            	System.out.print(num + " ");
                //System.out.print(j + " "); //Notice the print and println Difference;
            	num++;
            }
            System.out.println();
        }
	}
}