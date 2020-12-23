import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Scanner;
//BufferReader
//Scanner


public class UserInput
{
	public static void main(String[] args) throws Exception{
		
/*
		int i = System.in.read(); //range only with 0 to 255;

		System.out.println(i); //prints ascii values

		System.out.println((char)i); //prints normal values
*/

/*

		String str = "";
		int i;

		while((i = System.in.read())!=48)
		{
			str +=(char)i;
		}
		System.out.println(str);

*/


/*
		String str;
		int i;

		Scanner sc = new Scanner(System.in);
 
		//str = sc.nextLine();  //takes input as String

	//	i = Integer.parseInt(sc.nextLine()); //so convert it to int

		i = sc.nextInt(); //if we know already its gonna be a int then we have other methods;

		System.out.println("Hello" + i);

*/



/*		
		System.out.println("Enter a Number");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//str = br.readLine(); //takes strings
		int n = Integer.parseInt(br.readLine()); //parse to int froms Strings;

		System.out.println(n);

*/
/*

		int n=0;

		System.out.println("Enter a Number");
		BufferedReader br=null; //BufferedReader is a resource and you should close the resource;

		try
		{
			br = new BufferedReader(new InputStreamReader(System.in));
			n = Integer.parseInt(br.readLine());
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			br.close();
		}
*/

    int n=0;
    System.out.println("Enter a Number");
//From java 1.8 You don't need to close a resource automatically closes the resource;;
    //Try with resource
    try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in)))
    {
    	n = Integer.parseInt(br.readLine());
    }

    System.out.println(n);



	}
}