import java.util.regex.*;

// -> \d for digits
// -> \S for whitespaces
// -> \w A word Character(letter|digits|_underscore);
//TO specify a set of Characters to search for 
// [abc] search for a's, b's, c's;
// [a-f] searches only for a,b,c,d,e,f characters;
// [a-f A-F] -search for first six letters
//----- Quantifiers --------
// 0x{0-1 or a-f or A-F} for Hexadecimals --> Generally 0[xX][0-9a-fA-F] (find one or more two digits in a row)
// source: "1 a12 234b 45a" 
// + -> one or more occurences
// * -> Zero or more occurences
// ? -> Zero or one Occurence
// So now Hexademical is 0[xX]([0-9a-fA-F])+
// Predefined dot "." -> means any character can served here 


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