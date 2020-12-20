public class JumpDemo
{
	public static void main(String[] args) {
		
        for(int i=1;i<=5;i++)
        {
            if(i==3)
            {   System.out.println("This is Skipped");
                continue;

            }
            System.out.println("value is" + i);
        }
        
        System.out.println("Another Example");

        for(int i=1;i<=5;i++)
        {
            if(i==3)
            {   System.out.println("From here everything is stopped");
                break;

            }
            System.out.println("value is" + i);
        }
      
	}
}