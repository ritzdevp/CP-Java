import java.util.Scanner;
public class FermatsLittleTheoremForMultModInv {
	
	public static int modIterative(int a, int b, int c){
		int result = 1;
		
		while (b>0){
			//if odd
			if (b%2!=0){
				result  = ( result * a ) % c ;
			}
			
			a = ( a * a ) % c;
			
			b = b / 2;
		}
		
		return result%c;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();  //an integer whose multiplicative modulo inverse is to be found
		int m = s.nextInt(); //prime mod
		
		//if (a.b)%m = 1 then b is mult mod inv
		
		//According to Fermat's Little Theorem multmodinv of a is (a^(m-2))mod m
		// modular exponentiation is used to find (a^(m-2))mod m
		
		int inv_of_a = modIterative(a, m-2, m);
		
		System.out.println(inv_of_a);
		
		
	}

}
