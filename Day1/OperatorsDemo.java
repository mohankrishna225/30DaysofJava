public class OperatorsDemo
{
	public static void main(String[] args) {
		int m=6,n=4;

		int r1 = m+n;
		int r2 = m-n;
		int r3 = m*n;
		int r4 = m/n; // 1.5 but prints 1 since / operator gives int as return type;
		float r5 = (float)m/n; //1.5 
		double r6 = (float)m/n; // 1.5 
		System.out.println(r6);
		double r7  = (double)m%n;
		System.out.println(r7);

		n = n+m;
		System.out.println(n);
		n+=m; //Shorthand Operators
		System.out.println(n);
		n++; // Increment operator
		System.out.println(n);
		n+=1; //same as n++;
		System.out.println(n);
		n-=1; // same as n--;
		System.out.println(n);

		m=10;
		n=11;
		m=n; 
		System.out.println(m); //11
		System.out.println(n); //11
		m=n++;   
		System.out.println(m); //11
 		System.out.println(n); //12
		m=++n;
		System.out.println(m); //13
		System.out.println(n); //13

		







	}
}