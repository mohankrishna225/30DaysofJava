public class SwitchCase
{
	public static void main(String[] args) {
		int n =5;
		char c = 'A';
		switch(n)
		{
			case 1: 
				System.out.println("One");
				break;
			case 2: 
				System.out.println("Two");
				break;
			default:
				System.out.println("No Match");	
		}

		switch(c) //Since chars are ASCII's right
		{
			case 'A': 
				System.out.println("One");
				break;
			case 'B': 
				System.out.println("Two");
				break;
			default:
				System.out.println("No Match");	
		}

		String m = "abc"; //works for Java version 1.7 and above only
		switch(m)
		{
			case "abc": 
				System.out.println("One");
				break;
			case "pqr": 
				System.out.println("Two");
				break;
			default:
				System.out.println("No Match");	
		}


	}
}