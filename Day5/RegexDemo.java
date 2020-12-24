import java.util.regex.*;

class RegexDemo
{
	public static void main(String[] args) {
		
		Pattern p = Pattern.compile("ab");

		Matcher m = p.matcher("abaaaba");
		while(m.find())
		{
			System.out.println(m.start()+" ");
		}
	}
}