import java.util.Scanner;

public class WilsonsTheorem {
	
	//modular exponentiation
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
		
		// to find (n!)%m where m is a prime. m > n
		//Wilson's Theorem : (p-1)! mod p = -1 or p-1 , where p is a prime.
		
		
		int n = s.nextInt();
		int m = s.nextInt();
		
		int factor = 1;
		for (int i=n+1;i<=m-1;i++){
			factor = factor * modIterative(i, m-2, m);
		}
		int temp_ans = -1 * factor;
		temp_ans = temp_ans + m;
		
		System.out.println(temp_ans);
		
	}

}
