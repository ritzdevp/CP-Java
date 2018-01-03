import java.util.Scanner;

public class AdvancedGCD {


	public static long reduceB(long a, String b)
	{
		// Initialize result
		long mod = 0;

		// calculating mod of b with a to make
		// b like 0 <= b < a
		for (int i=0; i<b.length(); i++)
			mod = (mod*10 + b.charAt(i) - '0')%a;

		return mod; // return modulo
	}
	public static long gcd(long a, long b)
	{
		if (a==0)
		return b;
		return gcd(b%a,a);
	}
	
	public static long gcdLarge(long a, String b)
	{
		// Reduce 'b' (second number) after modulo with a
		long num = reduceB(a, b);

		// gcd of two numbers
		return gcd(a, num);
	}

	
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		s.nextLine();
		long ans[] = new long[t];
		for (int i=0;i<t;i++){
			String InputValue = s.nextLine();
			String[] Value = InputValue.split(" ");
	        long a = Long.parseLong(Value[0]);
	        String b = Value[1];
			ans[i] = gcdLarge(a,b);
		}

		for (int i=0;i<t;i++){
			System.out.println(ans[i]);
		}
	}

}
