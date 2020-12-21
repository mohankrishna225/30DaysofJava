public class WrapperDemo
{
	public static void main(String[] args) {
		
		int i = 5; //Primitive datatype

		Integer ii = new Integer(i); // Boxing - Wrapper Class
		System.out.println(ii);
		System.out.println(ii);

		int j = ii.intValue(); //Unboxing - Unwrapping


		Integer value = i; //AutoBoxing

		int k = value; //AutoUnboxing

		//primitive datatypes works faster speed than wrapper classes;
		//There are hibernate frameworks works only with wrapper calsses;


		String str = "123";

		int n = Integer.parseInt(str);  

		System.out.println(n);


	}
}